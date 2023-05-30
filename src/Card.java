public class Card {
    public String suit;
    public String name;
    public int value;
    public boolean isDealt;


    public Card(int pSuit, int pName){
        if(pSuit==0){
            suit = "Diamonds";
        }
        if(pSuit==1){
            suit = "Hearts";
        }
        if(pSuit==2){
            suit = "Clubs";
        }
        if(pSuit==3){
            suit = "Spades";
        }

    }
}
