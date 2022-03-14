package com.example.codelab05_celebrities;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CelebrityAdapter extends RecyclerView.Adapter<CelebrityAdapter.ViewHolder> {
    ArrayList<Celebrity> celebrities;
    OnClickItemListener onClickItemListener;

    public CelebrityAdapter(ArrayList<Celebrity> celebrities, OnClickItemListener onClickItemListener)
    {
        this.celebrities = celebrities;
        this.onClickItemListener = onClickItemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celebrity_item,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(celebrities.get(position).getName());
        holder.photo.setImageResource(celebrities.get(position).getPhoto());
/*        if(celebrities.get(position).getSex() == 'F')
        {
            holder.name.setBackgroundColor(R.color.pink);
        }
        else if(celebrities.get(position).getSex() == 'M'){
            holder.name.setBackgroundColor(R.color.blue);
        }*/
    }

    @Override
    public int getItemCount() {
        return celebrities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView photo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickItemListener.onClick(getBindingAdapterPosition());
                }
            });

            name = itemView.findViewById(R.id.name);
            photo = itemView.findViewById(R.id.photo);
        }
    }

    public interface OnClickItemListener
    {
        void onClick(int position);
    }
}
