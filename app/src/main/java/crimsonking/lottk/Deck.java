package crimsonking.lottk;

import java.util.ArrayList;
import java.util.Collections;

import crimsonking.lottk.enums.CardType;
import crimsonking.lottk.enums.Suit;

/**
 * Created by Jack on 2016-08-26.
 */
public class Deck {
    private static Deck ourInstance = new Deck();

    public static Deck getInstance() {
        return ourInstance;
    }

    private ArrayList<Card> cards;
    public ArrayList<Card> currentDeck;

    private Deck() {
        cards = new ArrayList<>();
        currentDeck = new ArrayList<>();
        InitialiseDeck();
        currentDeck = cards;
        Collections.shuffle(currentDeck);
        Collections.shuffle(currentDeck);
        Collections.shuffle(currentDeck);

    }

    private void InitialiseDeck(){
        Card AtkSp7 = new Card("Attack", 7, CardType.BASIC, Suit.SPADES);
        Card AtkSp8 = new Card("Attack", 8, CardType.BASIC, Suit.SPADES);
        Card AtkSp9 = new Card("Attack", 9, CardType.BASIC, Suit.SPADES);
        Card AtkSp10 = new Card("Attack", 10, CardType.BASIC, Suit.SPADES);
        Card AtkHe10 = new Card("Attack", 10, CardType.BASIC, Suit.HEARTS);
        Card AtkHeJ = new Card("Attack", 11, CardType.BASIC, Suit.HEARTS);

        Card DogHe2 = new Card("Dodge", 2, CardType.BASIC,Suit.HEARTS);
        Card DogHe8 = new Card("Dodge", 8, CardType.BASIC,Suit.HEARTS);
        Card DogHe9 = new Card("Dodge", 9, CardType.BASIC,Suit.HEARTS);
        Card DogHeJ = new Card("Dodge", 11, CardType.BASIC,Suit.HEARTS);
        Card DogHeQ = new Card("Dodge", 12, CardType.BASIC,Suit.HEARTS);
        Card DogHeK = new Card("Dodge", 13, CardType.BASIC,Suit.HEARTS);

        cards.add(AtkSp7);
        cards.add(AtkSp8);
        cards.add(AtkSp8);
        cards.add(AtkSp9);
        cards.add(AtkSp9);
        cards.add(AtkSp10);
        cards.add(AtkSp10);
        cards.add(AtkHe10);
        cards.add(AtkHe10);
        cards.add(AtkHeJ);

        cards.add(DogHe2);
        cards.add(DogHe2);
        cards.add(DogHe8);
        cards.add(DogHe9);
        cards.add(DogHeJ);
        cards.add(DogHeQ);
        cards.add(DogHeK);
    }

    public void checkReset(){
        if (currentDeck.size() == 0){
            currentDeck = cards;
            Collections.shuffle(currentDeck);
            Collections.shuffle(currentDeck);
            Collections.shuffle(currentDeck);
        }
    }

    public void dealCard(GamePlayer player){
        int size = currentDeck.size();
        player.hand.add(currentDeck.get(size-1));
        currentDeck.remove(size-1);
    }

}
