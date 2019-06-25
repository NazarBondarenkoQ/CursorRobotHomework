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
        int temp = random.nextInt(3) + asciiCharCode; // Here is the usage of constant "65+1" stays for "B" and "66+1" for "C" relevantly.
        char destination = (char)temp;
        String check = String.valueOf(destination);
        Terminator currentTerminator;
        Galaxy galaxy = Galaxy.GALAXY;

        if (choice <= 3) {
            currentTerminator = new Terminator("Desolator", "T-70", "Shotgun");
            terminatorAction(choice, currentTerminator);
        } else if (choice >= 4 && choice <= 8) {
            currentTerminator = new TerminatorUpgrade("Punisher", "T-2000", "Machine Gun", "Liquid");
            terminatorAction(choice, currentTerminator);
        } else {
            currentTerminator = new TerminatorLatest("Executor", "T-TX", "Rocket Launcher", "Solid");
            terminatorAction(choice, currentTerminator);
        }

        System.out.println("!!!Oh no, aliens have stole " + currentTerminator.getName() + " and taking him to another planet!!! " +
                "Random char is: " + destination + "\n");

        currentTerminator.activateArmor(check);
    }


    private static void terminatorAction(int choice, Terminator currentTerminator) {
        System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel() + "\n");
        currentTerminator.speak();
    }
}
