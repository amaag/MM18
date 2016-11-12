/**
 * A player in this game. Every AI controls one player.
 */

// DO NOT MODIFY THIS FILE
// Never try to directly create an instance of this class, or modify its member variables.
// Instead, you should only be reading its variables and calling its functions.

package games.saloon;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import joueur.Client;
import joueur.BaseGame;
import joueur.BaseGameObject;

// you can add addtional import(s) here

/**
 * A player in this game. Every AI controls one player.
 */
public class Player extends GameObject {
    /**
     * What type of client this is, e.g. 'Python', 'JavaScript', or some other language. For potential data mining purposes.
     */
    public String clientType;

    /**
     * Every Cowboy owned by this Player.
     */
    public List<Cowboy> cowboys;

    /**
     * How many enemy Cowboys this player's team has killed.
     */
    public int kills;

    /**
     * If the player lost the game or not.
     */
    public boolean lost;

    /**
     * The name of the player.
     */
    public String name;

    /**
     * This player's opponent in the game.
     */
    public Player opponent;

    /**
     * The reason why the player lost the game.
     */
    public String reasonLost;

    /**
     * The reason why the player won the game.
     */
    public String reasonWon;

    /**
     * How rowdy their team is. When it gets too high their team takes a collective siesta.
     */
    public int rowdiness;

    /**
     * How many times their team has played a piano.
     */
    public int score;

    /**
     * 0 when not having a team siesta. When greater than 0 represents how many turns left for the team siesta to complete.
     */
    public int siesta;

    /**
     * The amount of time (in ns) remaining for this AI to send commands.
     */
    public double timeRemaining;

    /**
     * If the player won the game or not.
     */
    public boolean won;

    /**
     * The YoungGun this Player uses to call in new Cowboys.
     */
    public YoungGun youngGun;


    // you can add addtional field(s) here. None of them will be tracked or updated by the server.


    /**
     * Creates a new instance of a Player. Used during game initialization, do not call directly.
     */
    public Player() {
        super();
        this.cowboys = new ArrayList<Cowboy>();
    }

    // you can add addtional method(s) here.
}
