package com.company.pokemons;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dam on 10/10/16.
 */
public class Encostipat implements Capturable{

    @Override
    public boolean capturar() {


        int costipat = ThreadLocalRandom.current().nextInt(120 - 20 + 1);

        if (costipat > 50) {

            return true;


        } else {
            return false;

        }

    }

}
