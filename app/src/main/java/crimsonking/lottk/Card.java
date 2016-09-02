package crimsonking.lottk;

import com.google.android.gms.games.Player;

import crimsonking.lottk.enums.CardType;
import crimsonking.lottk.enums.Suit;

/**
 * Created by Jack on 2016-08-26.
 */
public class Card {

    private String cardName;
    private int cardNumber;
    private CardType cardType;
    private Suit suit;

    public Card(String cardName, int cardNumber, CardType cardType, Suit suit){

        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.suit = suit;
    }

    public void Use(){

    }

    public void Use(Player player){

    }

}
