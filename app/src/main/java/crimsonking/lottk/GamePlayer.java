package crimsonking.lottk;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;

import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

import java.util.ArrayList;

import crimsonking.lottk.enums.CharRole;

/**
 * Created by Jack on 2016-08-26.
 */
public class GamePlayer implements Player {

    public static Creator CREATOR;

    public ArrayList<Card> hand;
    public CharRole role;
    public int health;

    public GamePlayer(){
        hand = new ArrayList<>();
        health = 0;
        role = CharRole.UNASSIGNED;
    }

    public CharRole getRole(){
        return role;
    }

    public void setRole(CharRole role){
        this.role = role;
    }

    public ArrayList<Card> getHand(){ return hand; }

    public int getHealth(){ return health; }

    public void setHealth(int health){
        this.health = health;
    }

    @Override
    public String getPlayerId() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public void getDisplayName(CharArrayBuffer charArrayBuffer) {

    }

    @Override
    public String zzbff() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean zzbfg() {
        return false;
    }

    @Override
    public boolean hasIconImage() {
        return false;
    }

    @Override
    public Uri getIconImageUri() {
        return null;
    }

    @Override
    public String getIconImageUrl() {
        return null;
    }

    @Override
    public boolean hasHiResImage() {
        return false;
    }

    @Override
    public Uri getHiResImageUri() {
        return null;
    }

    @Override
    public String getHiResImageUrl() {
        return null;
    }

    @Override
    public long getRetrievedTimestamp() {
        return 0;
    }

    @Override
    public long getLastPlayedWithTimestamp() {
        return 0;
    }

    @Override
    public int zzbfh() {
        return 0;
    }

    @Override
    public boolean zzbfi() {
        return false;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getTitle(CharArrayBuffer charArrayBuffer) {

    }

    @Override
    public PlayerLevelInfo getLevelInfo() {
        return null;
    }

    @Override
    public MostRecentGameInfo zzbfj() {
        return null;
    }

    @Override
    public Uri getBannerImageLandscapeUri() {
        return null;
    }

    @Override
    public String getBannerImageLandscapeUrl() {
        return null;
    }

    @Override
    public Uri getBannerImagePortraitUri() {
        return null;
    }

    @Override
    public String getBannerImagePortraitUrl() {
        return null;
    }

    @Override
    public int zzbfk() {
        return 0;
    }

    @Override
    public long zzbfl() {
        return 0;
    }

    @Override
    public boolean isMuted() {
        return false;
    }

    @Override
    public Player freeze() {
        return null;
    }

    @Override
    public boolean isDataValid() {
        return false;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
