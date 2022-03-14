package com.example.codelab05_ex01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PostAdapter.OnListItemClickListener{
    RecyclerView recyclerView;
    ArrayList<Post> posts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        posts = new ArrayList<>();
        posts.add(new Post("Corona"));
        posts.add(new Post("CodeLab 04"));
        posts.add(new Post("Ionut"));
        posts.add(new Post("AND classes"));
        posts.add(new Post("Corona"));
        posts.add(new Post("CodeLab 04"));
        posts.add(new Post("Ionut"));
        posts.add(new Post("AND classes"));
        posts.add(new Post("Corona"));
        posts.add(new Post("CodeLab 04"));
        posts.add(new Post("Ionut"));
        posts.add(new Post("AND classes"));
        posts.add(new Post("Corona"));
        posts.add(new Post("CodeLab 04"));
        posts.add(new Post("Ionut"));
        posts.add(new Post("AND classes"));

        PostAdapter postAdapter = new PostAdapter(posts, this);

        recyclerView.setAdapter(postAdapter);


        }


    @Override
    public void onClick(int position) {
        Toast.makeText(this, "Position: " + position + ", item: " + posts.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
