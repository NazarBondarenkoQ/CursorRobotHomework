package robot;

public class Terminator_Latest extends Terminator_Upgrade{
    private boolean invisibility;

    public Terminator_Latest(String name, String model, String weapon, String form) {
        super(name, model, weapon, form);
    }

    public void setInvisibility(){
        invisibility =! invisibility;
            if (invisibility == true){
                System.out.println("I'm invisible");
            }
            else
                System.out.println("I'm visible");
    }
}
