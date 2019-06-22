package robots;

public class TerminatorUpgrade extends Terminator{
    private String form;
    private String laser = "Laser";

    public TerminatorUpgrade(){

    }

    public TerminatorUpgrade(String name, String model, String weapon, String form){
        super(name, model, weapon);
        this.form = form;
    }
}
