package game.objects;

public class GameTable {
    static Card coloda[] = GameTable.makeColod();
    public GameTable (){

    }

    static Card[] makeColod(){
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

    public Card vziatka (Card card1,Card card2,Card card3,Card card4){
        int ochkiZaVziatku = card1.getPoints()+card2.getPoints()+card3.getPoints()+card4.getPoints();
        if(card1.getSuit().equals(card2.getSuit()) && card1.getRanc()<card2.getRanc()) card1=card2;
        if(card1.getSuit().equals(card3.getSuit()) && card1.getRanc()<card3.getRanc()) card1=card3;
        if(card1.getSuit().equals(card4.getSuit()) && card1.getRanc()<card4.getRanc()) card1=card4;
        card1.ochkiZaVziatku=ochkiZaVziatku;
        return card1;
    }

}
