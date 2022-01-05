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

}
