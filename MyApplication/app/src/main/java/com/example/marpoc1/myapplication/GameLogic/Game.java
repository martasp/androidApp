package com.example.marpoc1.myapplication.GameLogic;

import java.util.Random;

/**
 * Created by mart on 2018-02-20.
 */

public class Game {

 public int rnNumber;
 public Game() {
     Random rnd = new Random();
     rnNumber = rnd.nextInt(100);
 }
    public String DoGuess(int spejimas ) {
        String tekstas ="";
        if (spejimas==rnNumber)
        {
            tekstas ="laimejai";
        } else if (rnNumber>spejimas)
        {
            tekstas ="daugiau";
        }
        else if (rnNumber<spejimas)
        {
            tekstas ="maziau";
        }
        return tekstas;
    }
}