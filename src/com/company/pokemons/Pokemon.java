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
public abstract class Pokemon {
    private List<Pokemon> pokemonList;
    public Pokemon(){
        pokemonList = new ArrayList<>();
    }
    
    private String nom;
    private int atac;
    private int defensa;
    private int puntsSalut;

    public Pokemon(String nom, int atac, int defensa, int puntsSalut) {
        this.nom = nom;
        this.atac = atac;
        this.defensa = defensa;
        this.puntsSalut = puntsSalut;
    }
    

    public int getPuntsSalut() {
        return puntsSalut;
    }

    public void setPuntsSalut(int puntsSalut) {
        this.puntsSalut = puntsSalut;
    }


    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    public int getAtac() {
        return atac;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

        

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
            
            
    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", atac=" + atac +
                ", defensa='" + defensa + '\'' +
                ", punts de salut='" + puntsSalut + '\'' +
                '}';
        
    
    }   

}
