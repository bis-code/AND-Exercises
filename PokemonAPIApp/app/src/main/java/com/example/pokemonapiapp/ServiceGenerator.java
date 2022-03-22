package com.example.pokemonapiapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static PokemonApi pokemonApi;

    public static PokemonApi getPokemonApi()
    {
        if(pokemonApi == null)
        {
            pokemonApi = new Retrofit.Builder().
                    baseUrl("https://pokeapi.co")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(PokemonApi.class);
        }
        return pokemonApi;
    }
}
