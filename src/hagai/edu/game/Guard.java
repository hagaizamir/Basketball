package hagai.edu.game;
import hagai.edu.utils.IO;

public class Guard extends Player
{
    private int blocksAverageNumberPerGame;
/*
    public Guard(String firstName, String lastName, LocalDateTime birthDate, int height, int shirtNumber,
                 double freeThrowLineTargetShootingPersents, double fieldAreaTargetShootingPersents,
                 double threePointsAreaTargetShootingPersents, int averageBlocksNumberPerGame) {
        super(firstName, lastName, birthDate, height, shirtNumber, freeThrowLineTargetShootingPersents, fieldAreaTargetShootingPersents, threePointsAreaTargetShootingPersents);
        this.blocksAverageNumberPerGame = blocksAverageNumberPerGame;
    }
*/

    public Guard(Guard guard) {
        super(guard.getFirstName(), guard.getLastName(), guard.getBirthDate(), guard.getHeight(), guard.getShirtNumber(),
              guard.getFreeThrowLineTargetShootingPersents(), guard.getFieldAreaTargetShootingPersents(),
              guard.getThreePointsAreaTargetShootingPersents());
        this.blocksAverageNumberPerGame = guard.getBlocksAverageNumberPerGame();
    }

    public Guard(Team team)
    {
        super(team);
        this.blocksAverageNumberPerGame = IO.getInt("Enter Blocks Average Number Per Game", 0, 20);
    }

    @Override
    public String toString()
    {
        return "Guard:\n" + super.toString() + "\nBlocks Average Number Per Game: " + blocksAverageNumberPerGame;
    }

    public int getBlocksAverageNumberPerGame() {
        return blocksAverageNumberPerGame;
    }
}