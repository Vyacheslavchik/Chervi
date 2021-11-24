package game.objects;

import java.util.ArrayList;

public class Player {
    private String name;
    int points;
    ArrayList<Card> cards;
    public Player(String name, int points){
        this.name=name;
        this.points=points;
    }

    public String getName() {
        return name;
    }


}
