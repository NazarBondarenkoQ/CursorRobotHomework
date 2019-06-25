package planets;

public enum Galaxy {
    A("Sun Planet"), B("Ocean Planet"), C("Wind planet"), GALAXY("Galaxy");

    private String name;

    public String getName() {
        return name;
    }

    Galaxy(String name) {
        this.name = name;
    }
}
