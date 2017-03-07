package hagai.edu.game;
import hagai.edu.utils.DateUtils;
import hagai.edu.utils.IO;
import hagai.edu.utils.RandomUtils;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Player {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private int height;
    private int shirtNumber;
    private double freeThrowLineTargetShootingPersents;
    private double fieldAreaTargetShootingPersents;
    private double threePointsAreaTargetShootingPersents;

    public Player(String firstName, String lastName, LocalDateTime birthDate, int height, int shirtNumber,
                  double freeThrowLineTargetShootingPersents, double fieldAreaTargetShootingPersents,
                  double threePointsAreaTargetShootingPersents) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.height = height;
        this.shirtNumber = shirtNumber;
        this.freeThrowLineTargetShootingPersents = freeThrowLineTargetShootingPersents;
        this.fieldAreaTargetShootingPersents = fieldAreaTargetShootingPersents;
        this.threePointsAreaTargetShootingPersents = threePointsAreaTargetShootingPersents;
    }

    public Player(Team team) {
        this.firstName = IO.getString("Enter Player Fitst Name: ");
        this.lastName = IO.getString("Enter Player Last Name: ");
        this.birthDate = IO.getDate(" of Birthday of Player: ", 1975, 2012);
        this.height = IO.getInt("Enter Player Height in Centimeters: ");

        int shirtNumber = 0;
        boolean isExit = false;
        do {
            shirtNumber = IO.getInt("Enter Player Shirt Number: ", 0, 99);
            Player existentPlayer = team.getPlayerByShirtNumber(shirtNumber);
            if (existentPlayer == null) {
                this.shirtNumber = shirtNumber;
                isExit = true;
            }
        } while (!isExit);

        this.freeThrowLineTargetShootingPersents = IO.getDouble("Enter Player Free Throw Line Target Shooting Persents: ", 0, 100);
        this.fieldAreaTargetShootingPersents = IO.getDouble("Enter Player Field Area Target Shooting Persents: ", 0, 100);
        this.threePointsAreaTargetShootingPersents = IO.getDouble("Enter Player Three Points Target Shooting Persents: ", 0, 100);
    }

    public boolean isOnTargetThrowFromFreeThrowLine() {
        if ((RandomUtils.randGen.nextDouble() * 100) < freeThrowLineTargetShootingPersents) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnTargetThrowFromFieldArea() {

        if ((RandomUtils.randGen.nextDouble() * 100) < fieldAreaTargetShootingPersents)

        {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnTargetThrowFromThreePointsArea() {
        if (RandomUtils.nextDouble(1, 100) < threePointsAreaTargetShootingPersents) {
            return true;
        } else {
            return false;
        }
    }

    public void dribbling() {
        System.out.println("Dribbling");
    }

    public void throwsFromFreeThrowLine() {
        System.out.print(" throws From Free Throw Line ");
        if (isOnTargetThrowFromFreeThrowLine()) {
            System.out.println(" on Target");
        } else {
            System.out.println(" out of Target");
        }
    }

    public void throwsFromFieldArea() {
        System.out.print(" throws From Field Area");
        if (isOnTargetThrowFromFieldArea()) {
            System.out.println(" on Target");
        } else {
            System.out.println(" out of Target");
        }
    }

    public void throwsFromThreePointsArea() {
        System.out.print(" throws From Three Points Area");
        if (isOnTargetThrowFromThreePointsArea()) {
            System.out.println(" on Target");
        } else {
            System.out.println(" out of Target");
        }
    }

    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + DateUtils.howManyYearsFromNow(birthDate)
                + "\nHeight: " + height + " Centimeters" + "\nShirt Number: " + shirtNumber
                + "\nFree Throw Line Target Shooting Persents: " + new DecimalFormat("#.##").format(freeThrowLineTargetShootingPersents) + "%"
                + "\nField  Area Target Shooting Persents: " + new DecimalFormat("#.##").format(fieldAreaTargetShootingPersents) + "%"
                + "\nThree Points Area Target Shooting Persents: " + new DecimalFormat("#.##").format(threePointsAreaTargetShootingPersents) + "%";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public int getHeight() {
        return height;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public double getFreeThrowLineTargetShootingPersents() {
        return freeThrowLineTargetShootingPersents;
    }

    public double getFieldAreaTargetShootingPersents() {
        return fieldAreaTargetShootingPersents;
    }

    public double getThreePointsAreaTargetShootingPersents() {
        return threePointsAreaTargetShootingPersents;
    }
}