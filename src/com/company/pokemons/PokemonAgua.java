package com.company.pokemons;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dam on 3/10/16.
 */
public class PokemonAgua extends Pokemon implements Capturable {


    private String tipus = "agua";
    private String efectiuContra = "foc";
    private String debilContra = "planta";

    public PokemonAgua(String nom, int atac, int defensa, int puntsSalut, String tipus, String efectiuContra, String debilContra) {
        super(nom, atac, defensa, puntsSalut);
        this.tipus = tipus;
        this.efectiuContra = efectiuContra;
        this.debilContra = debilContra;
    }

    @Override
    public boolean capturar() {


        int n = ThreadLocalRandom.current().nextInt(120 - 20 + 1);
        int numCapturar = n - this.getPuntsSalut();

        if (numCapturar > this.getDefensa()) {

            return true;


        } else {
            return false;

        }

    }
}
