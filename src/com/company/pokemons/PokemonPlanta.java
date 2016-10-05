package com.company.pokemons;

/**
 * Created by dam on 4/10/16.
 */
public class PokemonPlanta extends Pokemon {

    private String tipus = "planta";
    private String efectiuContra = "agua";
    private String debilContra = "foc";

    public PokemonPlanta(String nom, int atac, int defensa, int puntsSalut, String tipus, String efectiuContra, String debilContra) {
        super(nom, atac, defensa, puntsSalut);
        this.tipus = tipus;
        this.efectiuContra = efectiuContra;
        this.debilContra = debilContra;
    }
}