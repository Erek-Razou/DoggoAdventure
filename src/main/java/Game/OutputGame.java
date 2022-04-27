package Game;

import Game.Character.Player;
import Game.Scene_Stuff.Map;


//TODO: Make the Descriptions changable
//TODO: help command to show at user the available commands
//TODO: Fix go south east bug



public class OutputGame {
    private Player doggo;
    private Map map;
    private boolean finished;

    public OutputGame() {
        map = new Map();
        doggo = new Player("Doggo", map.getScene("Start"));
        finished = false;
    }

    public boolean isFinished() {
        return finished;
    }

    public String fart() {
        if (doggo.isFartDeadly()) {
            switch (doggo.getLocation().getName()) {
                case "Castle":
                    finished = true;
                    return "YES. Elon Musk is dead. YOU are the toppest crypto of them all. Good job buddy";
                default:
                    return "The plants next to you died from the smell...this seems useful";
            }
        } else {
            switch (doggo.getLocation().getName()) {
                case "Castle":
                    return "Elon Musk: Your fart is smelly but not deadly...at least not yet.";
                case "Chinatown":
                    return "A chinese man next to you puts on another mask on top of the one he had";
                default:
                    return "The fly puked by the smell and judged you as it was leaving..you feel embarrassed.";
            }
        }
    }

    public void showIntro() {
        String intro;
        intro = "Welcome to The Doggo Adventure! \n" +
                "Your goal is to become the most famous Crypto that has ever existed\n" +
                "To do so, you must collect the 4 most famous Cryptos and enter the Castle\n" +
                "BUT BE CAREFUL!Doors,especially Castle ones, are locked for a reason!\n" +
                "Good luck!";
        System.out.println(intro);
    }

}