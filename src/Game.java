import javax.smartcardio.CardException;

public class Game {
    public int a;
    public int b;
    public Card card1;
    public Card card2;
    public Card[] deck;
    public int count =0;
    public static void main(String[] args) {
        Game blackjack;
        blackjack = new Game();
    }
public Game(){
        System.out.println("Game Constructor");
//        card1 = new Card(1,1);
//        card1.printCard();
//        card2 = new Card(2,2);
//        card2.printCard();
    deck = new Card[52];

    for(int w=0; w<4; w++){
        for(int x=0;x<13;x++){
            deck[count] =  new Card(w, x);
            count++;
        }
    }

//        for(int x=0;x<13;x++){
//            deck[x+13] = new Card(x, w);
//        }
    shuffle();
    }





    public void shuffle(){
        Card[] shuffleddeck = new Card[52];
        for(int f = 0; f< shuffleddeck.length;){
            int randomCard = (int)(Math.random()*52);
            Card shufflecard = deck[randomCard];
            while(deck[randomCard].isDealt==true){
                randomCard= (int)(Math.random()*52);
                shufflecard = deck[randomCard];
            }
            deck[randomCard].isDealt = true;
            shufflecard.printCard();

            shuffleddeck[f] = shufflecard;
        }
        deck = shuffleddeck;
    }
}



//Print all 52 cards and finish that

