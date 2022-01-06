package game.objects;

import java.util.ArrayList;
import java.util.Random;

public class GameTable {
    private ArrayList<Card> coloda = GameTable.makeColod();
    public GameTable (String namePlayer){
        Player players [] = {new Player(namePlayer),new Player("Din"),new Player("Sam"),new Player("Kas")};
        getCardsToPlayers(players);

    }

    private static ArrayList<Card> makeColod(){
        ArrayList<Card>coloda = new ArrayList<>();
        for(int i=0,valueCards=0;i<4;i++){
            for(int q=0;q<13;q++,valueCards++){
                if(i==0) coloda.add(new Card("H",q,1));
                 else if(i==1) coloda.add(new Card("B",q,0));
                 else if (i==2)coloda.add(new Card("K",q,0));
                 else if(i==3){
                     if(q==10)coloda.add(new Card("P",q,13));
                     else coloda.add(new Card("P",q,0));
                }
            }
        }
        return coloda;
    }
    private void getCardsToPlayers(Player players []){
          Random rnd = new Random();
          int q=51;
          int a;
          for (int w=0;w<4;w++)
          for (int i=0;i<13;i++,q--){
              if(q!=0) a=rnd.nextInt(q);
              else a=0;
              coloda.get(a).host=players[w];
              players[w].cards.add(coloda.get(a));
              coloda.remove(a);
          }

    }

    private Card vziatka (Card card1,Card card2,Card card3,Card card4){
        int ochkiZaVziatku = card1.getPoints()+card2.getPoints()+card3.getPoints()+card4.getPoints();
        if(card1.getSuit().equals(card2.getSuit()) && card1.getRanc()<card2.getRanc()) card1=card2;
        if(card1.getSuit().equals(card3.getSuit()) && card1.getRanc()<card3.getRanc()) card1=card3;
        if(card1.getSuit().equals(card4.getSuit()) && card1.getRanc()<card4.getRanc()) card1=card4;
        card1.ochkiZaVziatku=ochkiZaVziatku;
        return card1;
    }

}
