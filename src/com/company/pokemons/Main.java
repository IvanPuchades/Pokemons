/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.pokemons;

import java.util.ArrayList;

/**
 *
 * @author 48224788K
 */
public class Main {
  
    public static void main(String[] args){
        Pokemon pokemon = new Pokemon();
        
        Pokemon Squirtle = new Pokemon("Squirtle", 20, 10, 30);
        Pokemon Pikachu = new Pokemon("Pikachu", 15, 20, 27);
    
        
        pokemon.altaPokemon(Squirtle);
        pokemon.altaPokemon(Pikachu);
        
        System.out.println("Se ha introducido un nuevo pokemon: " + pokemon.obtenerTodas());
    }
    
}
