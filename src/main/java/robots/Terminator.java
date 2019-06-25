package robots;

import planets.Galaxy;

public class Terminator implements Transformation {
    private String name;
    private String model;
    private String weapon;
    private boolean armor;

    public Terminator() {

    }

    public Terminator(String name, String model, String weapon) {
        this.name = name;
        this.model = model;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getWeapon() {
        return weapon;
    }

    public void walk() {
        System.out.println("Robot is walking");
    }

    public void speak() {
        System.out.println("Robot " + name + " says: \" I'm going to kill you \"\n");
    }

    public void shoot() {
        System.out.println("Bang bang!");
    }

    @Override
    public void activateArmor(String name) {
        System.out.println("Robot has been taken to: " + Galaxy.valueOf(name).getName() + ". Armor is activated");
    }

}
