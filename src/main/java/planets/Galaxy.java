package planets;

import robots.Transformation;

public enum Galaxy implements Transformation {
    SUN_PLANET("Sun Planet"), OCEAN_PLANET("Ocean Planet"), WIND_PLANET("Wind planet"), GALAXY("Galaxy");

    String name;

    Galaxy(String name) {
        this.name = name;
    }


    @Override
    public void activateArmor(char destination) {
        if (destination == 'A') {
            System.out.println("Robot has been taken to: " + Galaxy.OCEAN_PLANET.name + ". Armor is activated");
        } else if (destination == 'B') {
            System.out.println("Robot has been taken to: " + Galaxy.WIND_PLANET.name + ". Armor is activated");
        } else {
            System.out.println("Robot has been taken to: " + Galaxy.SUN_PLANET.name + ". Armor is activated");
        }
    }
}
