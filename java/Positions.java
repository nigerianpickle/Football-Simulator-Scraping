import java.util.HashMap;
import java.util.Map;

public class Positions {
    //i need a set of userdetermined positons
    //will store this positions in sql database
    //each positon will also have data that lets it operate with chances
    
    private Map<Player, String> playerPositions;

    public Positions() {
        this.playerPositions = new HashMap<>();
    }

    public void assignPosition(Player player, String position) {
        playerPositions.put(player, position);
    }

    public String getPosition(Player player) {
        return playerPositions.get(player);
    }

    // You can add more methods or functionality as needed


}
