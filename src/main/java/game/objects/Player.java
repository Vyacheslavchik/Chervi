package game.objects;

import java.util.ArrayList;
import java.util.RandomAccess;

public class Player {
    private String name;
    int points;
    ArrayList<Card> cards=new ArrayList<>();
    public Player(String name){
        this.name=name;
        this.points=0;
    }

    public String getName() {
        return name;
    }

    ArrayList<Card> giveThreeCards (){
        ArrayList<Card> cards= new ArrayList<Card>();
            for(int q=12;;q--) {
                for (int i = 0; i < this.cards.size(); i++) {
                    if(this.cards.get(i).getRanc()==q){
                        cards.add(this.cards.get(i));
                        this.cards.remove(i);
                    }
                    if(cards.size()==3)return cards;
                }
            }

    }

}
