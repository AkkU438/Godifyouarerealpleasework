package Birds;

public class raptors extends Package2 {
        public String Fly = "This animal is flying towards you";
        private String Hunt = "This animal is hunting right now";
        protected String Color;
        final String Survival = "The survival rate of small raptors is 60-70%, while large ones have a survival rate of 90%!";
        public static String count = "There are 482 species of raptors";

        public raptors( String Beak, int Wings, double Feathers){
            super( Beak,  Wings,  Feathers);
            System.out.println(Fly);
        }
        public raptors(){
            super();
            System.out.println(Fly);
        }
       
        public void Dive() {
            System.out.println("Raptor is diving at prey.");
        }
       
       
        public void Hunt() {
            System.out.println(Hunt);
        }
        public void Hunt(String value) {
            Hunt = value;
        }
    }

