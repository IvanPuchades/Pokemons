/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.pokemons;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 48224788K
 */
public class Main {

    public static void main(String[] args){


        Pokemon Squirtle = new PokemonAgua("squirtle", 20, 10, 30, "agua", "foc", "planta");
        Pokemon Charmander = new PokemonFoc("charmander", 15, 20, 27, "foc", "planta", "agua");
        System.out.println("pokemon1: "+Squirtle.toString());
        System.out.println("pokemon2: "+Charmander.toString());

        List<Capturable> pokemonsCapturables = new ArrayList<>();
        pokemonsCapturables.add(Squirtle);
        pokemonsCapturables.add(Charmander);

        pokemonsCapturables.
                forEach(pokemon ->
                {
                    if (pokemon.capturar()) {
                        System.out.println("Pokemon capturado ");
                    }else {
                        System.out.println("Pokemon no capturado ");
                    }
                });





    }
    private List<Pokemon> pokemonList;

    public Main(){
        pokemonList = new ArrayList<>();
    }
    public void altaPokemon(Pokemon pokemon){
        Boolean repe = false;

        for (int i = 0; i< pokemonList.size();i++){
            Pokemon p = pokemonList.get(i);
            if(p.getNom().equalsIgnoreCase(pokemon.getNom())){
                repe = true;
            }


        }
        if(!repe){
            pokemonList.add(pokemon);
        }

    }

    public List<Pokemon> obtenerTodas() {
        return pokemonList;
    }

}
