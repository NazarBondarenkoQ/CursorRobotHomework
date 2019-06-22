package robots;

    public class TerminatorLatest extends Terminator_Upgrade{
        private boolean invisibility;

        public TerminatorLatest(String name, String model, String weapon, String form) {
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
