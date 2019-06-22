package robots;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int choice = random.nextInt(12) + 1;

        Terminator currentTerminator;

        if (choice < 3) {
            currentTerminator = new Terminator("Desolator", "T-70", "Shotgun");

            System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel());

            currentTerminator.speak();
        }

        else if (choice > 3 && choice <= 8) {
            currentTerminator = new TerminatorUpgrade("Punisher", "T-2000", "Machine Gun", "Liquid");

            System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel());

            currentTerminator.speak();

        } else {
            currentTerminator = new TerminatorLatest("Executor", "T-TX", "Rocket Launcher", "Solid");

            System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel());

            currentTerminator.speak();
        }
    }
}
