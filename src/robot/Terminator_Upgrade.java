package robot;

public class Terminator_Upgrade extends Terminator{
    private String form;
    private String laser = "Laser";

    public Terminator_Upgrade(){

    }

    public Terminator_Upgrade(String name, String model, String weapon, String form){
        super(name, model, weapon);
        this.form = form;
    }
}
