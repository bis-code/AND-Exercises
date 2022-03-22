package com.example.pokemonapiapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class PokemonViewModel extends ViewModel {
    PokemonRepository repository;

    public PokemonViewModel()
    {
        repository = PokemonRepository.getInstance();
    }

    LiveData<Pokemon> getSearchedPokemon(){
        return repository.getSearchedPokomen();
    }

    public void searchForPokemon(String s)
    {
        repository.searchForPokemon(s);
    }
}
