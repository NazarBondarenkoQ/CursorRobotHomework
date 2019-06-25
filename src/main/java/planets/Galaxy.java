package planets;

public enum Galaxy {
    A("Ocean Planet"), B("Wind Planet"), C("Sun Planet");

    private String name;

    public String getName() {
        return name;
    }

    Galaxy(String name) {
        this.name = name;
    }
}
