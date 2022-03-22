package com.example.pokemonapiapp;

public class PokemonResponse {
    private int id;
    private String name;
    private Sprites sprites;

    public Pokemon getPokemon() {
        return new Pokemon(id,name,sprites.front_default);
    }

    private static class Sprites{
        private String front_default;
    }
}
