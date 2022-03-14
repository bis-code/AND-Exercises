package com.example.codelab05_celebrities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CelebrityAdapter.OnClickItemListener {

    RecyclerView recyclerView;
    ArrayList<Celebrity> celebrities = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        celebrities.add(new Celebrity("George Clooney",'M',R.drawable.george_clooney,"I don't like to share my personal life...it wouldn't be personal if I shared it."));
        celebrities.add(new Celebrity("Jess C. Scott",'F',R.drawable.jess_c_scott,"What's the whole point of being pretty on the outside when you're so ugly on the inside?"));
        celebrities.add(new Celebrity("Taylor Jenkins Reid",'F',R.drawable.taylor_jenkins_reid,"Heartbreak is a loss. Divorce is a piece of paper."));
        celebrities.add(new Celebrity("Lady Gaga",'F',R.drawable.lady_gaga,"I'm obsessively opposed to the typical."));
        celebrities.add(new Celebrity("Sean Penn",'M',R.drawable.sean_penn,"When everything gets answered, it's fake."));

        CelebrityAdapter celebrityAdapter = new CelebrityAdapter(celebrities, this);
        recyclerView.setAdapter(celebrityAdapter);
    }

    @Override
    public void onClick(int position) {
        Toast.makeText(this, celebrities.get(position).getQuote(), Toast.LENGTH_SHORT).show();
    }
}