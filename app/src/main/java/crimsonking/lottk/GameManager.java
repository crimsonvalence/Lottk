package crimsonking.lottk;

import com.google.android.gms.games.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import crimsonking.lottk.enums.CharRole;

/**
 * Created by Jack on 2016-08-28.
 * :( good luck
 */
public class GameManager {
    private static GameManager ourInstance = new GameManager();

    public static GameManager getInstance() {
        return ourInstance;
    }

    private ArrayList<GamePlayer> players;
    private Deck deck = Deck.getInstance();

    private GameManager() {
        players = new ArrayList<>();
        AddPlayers(players);
        AssignSeats(players);
        AssignRoles(players);
        SelectHero();
        DealFirstHand();
        GameLoop();

    }


    public void AddPlayers(ArrayList<GamePlayer> players){

    }

    public void AssignRoles(ArrayList<GamePlayer> players){
        if(players.size() == 2){
            Random random = new Random();
            int rnNum = random.nextInt(2);
            players.get(rnNum).setRole(CharRole.KING);
            for(GamePlayer p : players){
                if (p.getRole() == CharRole.UNASSIGNED){
                    p.setRole(CharRole.SPY);
                }
            }
        }


    }

    public void AssignSeats(ArrayList<GamePlayer> players){
        Collections.shuffle(players);
        Collections.shuffle(players);
        Collections.shuffle(players);
    }

    public void SelectHero(){

    }

    public void DealFirstHand(){
        for (GamePlayer p : players){
            for(int i=0;i<4;i++){
                deck.dealCard(p);
            }
        }
    }

    public void GameLoop(){
        GamePlayer posOne;
        for (GamePlayer p : players){
            if(p.getRole() == CharRole.KING){
                posOne = p;
            }
        }

        PrepPhase(posOne){

        }



    }

    public void PrepPhase(GamePlayer player){

    }

}
