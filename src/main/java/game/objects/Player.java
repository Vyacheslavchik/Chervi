package game.objects;

import java.util.ArrayList;

public class Player {
    private String name;
    int points;
    public Player(String name){
        this.name=name;
        this.points=0;
    }

    public String getName() {
        return name;
    }


}