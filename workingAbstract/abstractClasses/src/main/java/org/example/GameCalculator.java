package org.example;

public abstract class GameCalculator {

    public abstract int calculate();
    public final void gameOver(){
        System.out.println("Oyun Bitti " );
    }
}
