package ocp.ch4.lambda.example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 10405
 */
interface Gorilla {

    String move();
}

public class GorillaFamily {

    String walk = "walk";

    public void everyonePlay(boolean baby) {
        String approach = "amble";
        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    public void play(Gorilla g) {
        System.out.println(g.move());
    }
    
    public static void main(String[] args) {
        new GorillaFamily().everyonePlay(true);
    }
}
