package com.example.pokemonapiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private PokemonViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editText);
        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);
        viewModel.getSearchedPokemon().observe(this, pokemon ->{
            Glide.with(this).load(pokemon.getImageUrl()).into(imageView);
        });
    }

    public void searchForPokemon(View view)
    {
        viewModel.searchForPokemon(editText.getText().toString());
    }
}