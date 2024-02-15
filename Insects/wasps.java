package Insects;


    public class wasps extends Package4{
        public String Fly = "This animal is flying towards you";
        private String Hivemind = "This animals has a hivemind";
        protected String Color;
        final String Survival = "Wasps serve no purpose.";
        public static String count = "There are 103,000 wasp species";
    
        public wasps( String teeth, int potency, double fangs){
            super( teeth,  potency,  fangs);
            System.out.println(Fly);
        }
        public wasps(){
            super();
            System.out.println(Fly);
        }
        
        public void lunge() {
            System.out.println("Wasps are lunging.");
        }
        
        public void Hivemind() {
            System.out.println(Hivemind);
        }
        public void Hivemind(String value) {
            Hivemind = value;
        }
        
    }
    

