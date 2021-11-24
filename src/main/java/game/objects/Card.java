package game.objects;

public class Card {
    private String suit;
    private int ranc;
    private String picture;
    Player onwer;

    public Card( String suit,int ranc){
        this.suit=suit;
        this.ranc=ranc;
        picture = suit+ranc+".jpg";  //change later
    }

}
