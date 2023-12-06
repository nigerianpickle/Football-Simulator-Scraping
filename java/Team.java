import java.util.HashMap;
import java.util.Map;

public class Team {
    //Team model
    //Each team has a player table that is implemented using a hashmap 
    //So players are identified through their name


    String teamName;
    int teamRating;
    int totalRating=0;
    private Map<String, Player> playerTable;

    int teamLimit=32;//to limit the team size, the default size is 32

    public Team(String name) {
        this.teamName=name;
        this.playerTable = new HashMap<>();
    }

    //creating team with special limit
    public Team(String name,int i){
        this.teamName=name;
        this.teamLimit=i;
    }

    // Add a player to the team
    public void addPlayer(Player player) {
        playerTable.put(player.getName(), player);
        //get total rating
        totalRating+=player.getRating();

        teamRating=totalRating/playerTable.size();//gets the team rating  by finding the average
    }

    // Remove a player from the team
    public void removePlayer(String playerName) {
        Player removedPlayer = playerTable.remove(playerName);
        //remove the players rating from the team power
        totalRating-=removedPlayer.getRating();
        //change the teams rating
        teamRating=totalRating/playerTable.size();
    }

    // Get a player from the team
    public Player getPlayer(String playerName) {
        return playerTable.get(playerName);
    }
}
