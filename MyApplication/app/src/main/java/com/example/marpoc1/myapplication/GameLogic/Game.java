package com.example.marpoc1.myapplication.GameLogic;

import java.util.Random;

/**
 * Created by mart on 2018-02-20.
 */

public class Game {

 public int from;
 public int to;
 public int rnNumber;
 public Game(int from, int to) {
     Random rnd = new Random();
     this.from  = from;
     this.to = to;
     rnNumber = rnd.nextInt(to);


 }
    public String DoGuess(int spejimas ) {
        String tekstas ="";
        if (spejimas==rnNumber)
        {
            tekstas ="Winner";
        } else if (rnNumber>spejimas)
        {
            tekstas ="▲";
        }
        else if (rnNumber<spejimas)
        {
            tekstas ="▼";
        }
        return tekstas;
    }
}
