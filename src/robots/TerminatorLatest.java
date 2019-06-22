package robots;

<<<<<<< HEAD
public class TerminatorLatest extends TerminatorUpgrade {
    private boolean invisibility;
=======
    public class TerminatorLatest extends TerminatorUpgrade{
        private boolean invisibility;
>>>>>>> a77c14681215e7db69e0abab7f5c452b2a35bfb6

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
