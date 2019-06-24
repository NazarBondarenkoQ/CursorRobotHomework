import planets.Galaxy;
import robots.Terminator;
import robots.TerminatorLatest;
import robots.TerminatorUpgrade;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        final int asciiCharCode = 65; // I use ASCII character encoding to create a random character, "65" stays for "A" char.
        int choice = random.nextInt(12) + 1;
        int temp = random.nextInt(3) + asciiCharCode; // Here is the usage of constant "66" stays for "B" and "67" for "C".
        char destination = (char) temp;
        Terminator currentTerminator;

        if (choice <= 3) {
            currentTerminator = new Terminator("Desolator", "T-70", "Shotgun");
            terminatorAction(choice, currentTerminator);
        } else if (choice > 3 && choice <= 8) {
            currentTerminator = new TerminatorUpgrade("Punisher", "T-2000", "Machine Gun", "Liquid");
            terminatorAction(choice, currentTerminator);
        } else {
            currentTerminator = new TerminatorLatest("Executor", "T-TX", "Rocket Launcher", "Solid");
            terminatorAction(choice, currentTerminator);
        }

        System.out.println("!!!Oh no, aliens have stole " + currentTerminator.getName() + " and taking him to another planet!!! " +
                "Random char is: " + destination + "\n");

        switch (destination) {
            case 'A':
                robotTransformation(destination, currentTerminator);
                break;
            case 'B':
                robotTransformation(destination, currentTerminator);
                break;
            case 'C':
                robotTransformation(destination, currentTerminator);
                break;
        }
    }


    public static void terminatorAction(int choice, Terminator currentTerminator) {
        System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel() + "\n");
        currentTerminator.speak();
    }

    public static void robotTransformation(char destination, Terminator currentTerminator) {
        if (destination == 'A') {
            currentTerminator.activateArmor(Galaxy.OCEAN_PLANET);
        } else if (destination == 'B') {
            currentTerminator.activateArmor(Galaxy.WIND_PLANET);
        } else {
            currentTerminator.activateArmor(Galaxy.SUN_PLANET);
        }
    }
}
