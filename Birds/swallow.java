package Birds;

public class swallow extends Package2{
        public String Fly = "This animal is flying towards you";
        private String Hunt = "This animal is hunting right now";
        protected String Color;
        final String Survival = "The survival rate of Barn Swallow is 48.7%!";
       
        public swallow( String Beak, int Wings, double Feathers){
            super( Beak,  Wings,  Feathers);
            System.out.println(Fly);
        }
        public swallow(){
            super();
            System.out.println(Fly);
        }
       
        public void Dive() {
            System.out.println("Swallow is diving at prey.");
        }
       
       
        public void Hunt() {
            System.out.println(Hunt);
        }
        public void Hunt(String value) {
            Hunt = value;
        }
}

