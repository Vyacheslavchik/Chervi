package game.objects;

public class Card {
    private String suit;//масть
    private int ranc;
    private int points;
    public Player host;
    public int ochkiZaVziatku;

    public Card( String suit,int ranc,int points){
        this.suit=suit;
        this.ranc=ranc;
        this.points=points;
    }

    public String getSuit() {
        return suit;
    }

    public int getRanc() {
        return ranc;
    }

    public int getPoints() {
        return points;
    }
    @Override
    public String toString(){
        return "Karta";
    }
}
