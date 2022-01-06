package game.objects;

public class GameTable {
    public static Card coloda[] = GameTable.makeColod();
    public GameTable (String namePlayer){
        Player players [] = {new Player(namePlayer),new Player("Din"),new Player("Sam"),new Player("Kas")};
        System.out.println("fdgfgd");
        getCardsToPlayers(players);
        System.out.println("fdgfgd");
        for(int i =0;i<52;i++)
            System.out.println(coloda[i].host.getName() + " "+coloda[i].getSuit()+coloda[i].getRanc());
    }

    private static Card[] makeColod(){
        coloda = new Card[52];
        for(int i=0,valueCards=0;i<4;i++){
            for(int q=0;q<13;q++,valueCards++){
                if(i==0) coloda[valueCards]=new Card("H",q,1);
                 else if(i==1) coloda[valueCards]=new Card("B",q,0);
                 else if (i==2)coloda[valueCards]=new Card("K",q,0);
                 else if(i==3){
                     if(q==10)coloda[valueCards]=new Card("P",q,13);
                     else coloda[valueCards]=new Card("P",q,0);
                }
            }
        }
        return coloda;
    }
    private void getCardsToPlayers(Player players []){
        for(int q=0,w=1,e=2,r=3;r<52;q=+4,w=+4,e=+4,r=+4){
            coloda[q].host=players[0];
            coloda[w].host=players[1];
            coloda[e].host=players[2];
            coloda[r].host=players[3];
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
