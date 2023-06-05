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
        if(pName==0){
            name = "Ace";
        }
        if(pName==1){
            name = "Two";
        }
        if(pName==2){
            name = "Three";
        }
        if(pName==3){
            name = "Four";
        }
        if(pName==4){
            name = "Five";
        }
        if(pName==5){
            name = "Six";
        }
        if(pName==6){
            name = "Seven";
        }
        if(pName==7){
            name = "Eight";
        }
        if(pName==8){
            name = "Nine";
        }
        if(pName==9){
            name = "Ten";
        }
        if(pName==10){
            name = "King";
        }
        if(pName==11){
            name = "Queen";
        }
        if(pName==12){
            name = "Jack";
        }
        System.out.println("This is the " + name + " of " + suit);
    }
    public void printCard(){
        System.out.println("This is the " + name + " of " + suit);
    }

}
