package hagai.edu.game;
import hagai.edu.utils.IO;

public class Center extends Player
{
    private int assistsAverageNumberPerGame;
/*
    public Center(String firstName, String lastName, LocalDateTime birthDate, int height, int shirtNumber,
                  double freeThrowLineTargetShootingPersents, double fieldAreaTargetShootingPersents,
                  double threePointsAreaTargetShootingPersents, int assistsAverageNumberPerGame)
    {
        super(firstName, lastName, birthDate, height, shirtNumber, freeThrowLineTargetShootingPersents, fieldAreaTargetShootingPersents, threePointsAreaTargetShootingPersents);
        this.assistsAverageNumberPerGame = assistsAverageNumberPerGame;
    }
*/

    public Center(Center center) {
        super(center.getFirstName(), center.getLastName(), center.getBirthDate(), center.getHeight(), center.getShirtNumber(),
                center.getFreeThrowLineTargetShootingPersents(), center.getFieldAreaTargetShootingPersents(),
                center.getThreePointsAreaTargetShootingPersents());
        this.assistsAverageNumberPerGame = center.getAssistsAverageNumberPerGame();
    }


    public Center(Team team)
    {
        super(team);
        this.assistsAverageNumberPerGame = IO.getInt("Enter Assists Average Number Per Game", 0, 20);
    }

    @Override
    public String toString()
    {
        return "Center:\n" + super.toString() + "\nAssists Average Number Per Game: " + assistsAverageNumberPerGame;
    }

    public int getAssistsAverageNumberPerGame() {
        return assistsAverageNumberPerGame;
    }
}