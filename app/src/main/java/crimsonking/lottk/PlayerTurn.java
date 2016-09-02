package crimsonking.lottk;

import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

/**
 * Created by Jack on 2016-08-24.
 */
public class PlayerTurn {

    int turnCounter;
    String data = " ";

    public PlayerTurn(){

    }

    public byte[] persist(){
        byte[] byteArrayPlaceholder = new byte[]{ 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20 };
        return byteArrayPlaceholder;
    }

    public byte[] persist(TurnBasedMatch mMatch){
        byte[] byteArrayPlaceholder = new byte[]{ 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20 };
        return byteArrayPlaceholder;
    }

    public static PlayerTurn unpersist(byte[] mMatchData){

        return new PlayerTurn();

    }
}
