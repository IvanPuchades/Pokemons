package com.company.pokemons;

/**
 * Created by dam on 4/10/16.
 */
public class PokemonFoc extends Pokemon {

    private String tipus = "foc";
    private String efectiuContra = "planta";
    private String debilContra = "agua";

    public PokemonFoc(String nom, int atac, int defensa, int puntsSalut, String tipus, String efectiuContra, String debilContra) {
        super(nom, atac, defensa, puntsSalut);
        this.tipus = tipus;
        this.efectiuContra = efectiuContra;
        this.debilContra = debilContra;
    }
}
