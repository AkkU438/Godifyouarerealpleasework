package Birds;

public class Owls extends Package2 {
 
        public String Fly = "This animal is flying towards you";
        private String Hunt = "This animal is hunting right now";
        protected String Color;
        final String Survival = "The owls in the wild live for an average of 10 years!";
        public static String count = "There are 250 species of owls";
        
        public Owls( String Beak, int Wings, double Feathers){
            super( Beak,  Wings,  Feathers);
            System.out.println(Fly);
        }
        public Owls(){
            super();
            System.out.println(Fly);
        }
       
        public void Dive() {
            System.out.println("Owl is diving at prey.");
        }
       
       
        public void Hunt() {
            System.out.println(Hunt);
        }
        public void Hunt(String value) {
            Hunt = value;
        }
        
    }

