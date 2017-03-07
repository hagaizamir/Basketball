package hagai.edu.view;

import hagai.edu.game.Center;
import hagai.edu.game.Guard;
import hagai.edu.game.OffensePlayer;
import hagai.edu.game.Team;
import hagai.edu.utils.IO;

public class AddPlayersToTeamMenu
{
    public static void run(Team team)
    {
        boolean isExit = false;
        do {
            System.out.println("Press '1' - to add a Guard to the team");
            System.out.println("Press '2' - to add a Offense Player to the team");
            System.out.println("Press '3' - to add a Center to the team");
            System.out.println("Press '4' - to back to the main menu");

            int option = IO.getInt("Enter your option: ", 1, 4);
            switch (option) {
                case 1:
                    Guard guard = new Guard(team);
                    team.addPlayer(guard);
                    break;
                case 2:
                    OffensePlayer offensePlayer = new OffensePlayer(team);
                    team.addPlayer(offensePlayer);
                    break;
                case 3:
                    Center center = new Center(team);
                    team.addPlayer(center);
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    break;
            }
        } while (!isExit);
    }
}