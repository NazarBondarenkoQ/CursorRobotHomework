package robots;

public class TerminatorLatest extends TerminatorUpgrade {
    private boolean invisibility;

    public TerminatorLatest(String name, String model, String weapon, String form) {
        super(name, model, weapon, form);
    }

    public void setInvisibility() {
        invisibility = !invisibility;
        if (invisibility) {
            System.out.println("I'm invisible");
        } else {
            System.out.println("I'm visible");
        }
    }
}
