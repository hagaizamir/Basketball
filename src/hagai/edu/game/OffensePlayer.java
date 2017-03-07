package hagai.edu.game;
import hagai.edu.utils.IO;

public class OffensePlayer extends Player
{
    private int attackFoulsAverageNumberPerGame;
/*
    public OffensePlayer(String firstName, String lastName, LocalDateTime birthDate, int height, int shirtNumber,
                         double freeThrowLineTargetShootingPersents, double fieldAreaTargetShootingPersents,
                         double threePointsAreaTargetShootingPersents, int attackFoulsAverageNumberPerGame)
    {
        super(firstName, lastName, birthDate, height, shirtNumber, freeThrowLineTargetShootingPersents,
              fieldAreaTargetShootingPersents, threePointsAreaTargetShootingPersents);
        this.attackFoulsAverageNumberPerGame = attackFoulsAverageNumberPerGame;
    }
*/

    public OffensePlayer(OffensePlayer offensePlayer) {
        super(offensePlayer.getFirstName(), offensePlayer.getLastName(), offensePlayer.getBirthDate(), offensePlayer.getHeight(), offensePlayer.getShirtNumber(),
                offensePlayer.getFreeThrowLineTargetShootingPersents(), offensePlayer.getFieldAreaTargetShootingPersents(),
                offensePlayer.getThreePointsAreaTargetShootingPersents());
        this.attackFoulsAverageNumberPerGame = offensePlayer.getAttackFoulsAverageNumberPerGame();
    }

public OffensePlayer(Team team)
    {
        super(team);
        this.attackFoulsAverageNumberPerGame = IO.getInt("Enter Attack Fouls Average Number Per Game", 0, 5);

    }

    @Override
    public String toString() {
        return "Offense Player:\n" + super.toString() + "\nAttack Fouls Average Number Per Game: " + attackFoulsAverageNumberPerGame;
    }

    public int getAttackFoulsAverageNumberPerGame() {
        return attackFoulsAverageNumberPerGame;
    }
}