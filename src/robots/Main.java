package robots;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int choice = random.nextInt(12) + 1;

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
    }

    public static void terminatorAction(int choice, Terminator currentTerminator) {
        System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel());
        currentTerminator.speak();
    }
}
