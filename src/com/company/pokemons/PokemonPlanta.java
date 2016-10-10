package com.company.pokemons;

import java.util.concurrent.ThreadLocalRandom;

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

    @Override
    public boolean capturar() {


        int n = ThreadLocalRandom.current().nextInt(140 - 30 + 1);
        int numCapturar = n - this.getDefensa();

        if (numCapturar > this.getAtac()) {

            return true;


        } else {
            return false;

        }

    }
}