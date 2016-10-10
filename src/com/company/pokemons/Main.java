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
        Pokemon Lapras = new PokemonAgua("lapras", 40, 30, 20, "agua", "foc", "planta");
        Pokemon Charmander = new PokemonFoc("charmander", 15, 20, 27, "foc", "planta", "agua");
        Pokemon Ponyta = new PokemonFoc("ponyta" , 25, 20, 15, "foc", "planta", "agua");
        Pokemon Bulbasaur = new PokemonPlanta("bulbasaur" , 21, 15, 30, "planta", "agua", "foc");
        Pokemon Odish = new PokemonPlanta("odish" , 21, 15, 30, "planta", "agua", "foc");

        System.out.println("pokemon1: "+Squirtle.toString());
        System.out.println("pokemon2: "+Lapras.toString());
        System.out.println("pokemon3: "+Charmander.toString());
        System.out.println("pokemon4: "+Ponyta.toString());
        System.out.println("pokemon5: "+Bulbasaur.toString());
        System.out.println("pokemon6: "+Odish.toString());

        List<Capturable> pokemonsCapturables = new ArrayList<>();
        pokemonsCapturables.add(Squirtle);
        pokemonsCapturables.add(Lapras);
        pokemonsCapturables.add(Charmander);
        pokemonsCapturables.add(Ponyta);
        pokemonsCapturables.add(Bulbasaur);
        pokemonsCapturables.add(Odish);

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
