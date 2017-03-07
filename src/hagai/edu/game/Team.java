package hagai.edu.game;
import java.util.ArrayList;

public class Team
{
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player player)
    {
        players.add(player);
    }

    public void printAllPlayers()
    {
        if(players.size() == 0)
        {
            System.out.println("The Team does not have yet Players!");
        }
        else
        {
            for (Player player : players)
            {
                System.out.println(player + "\n");
            }
        }
    }

    public void  throwAllTeamFromThreePointsArea()
    {
        if(players.size() == 0)
        {
            System.out.println("The Team does not have yet Players!");
        }
        else {
            for (Player player : players) {
                System.out.print(player.getFirstName() + " " + player.getLastName());
                player.throwsFromThreePointsArea();
            }
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getPlayerByShirtNumber(int newShirtNumber)
    {
        for (Player player : players)
        {
            if(player.getShirtNumber() == newShirtNumber)
            {
                if( player instanceof Guard)
                {
                    return new Guard((Guard)player);
                }
                else
                {
                    if( player instanceof OffensePlayer)
                    {
                        return new OffensePlayer((OffensePlayer)player);
                    }
                    else
                    {
                        return new Center((Center)player);
                    }
                }
            }
        }

        return null;
    }
}