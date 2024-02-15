package Birds;

public class Package2 {
    public String Beak;
    @SuppressWarnings("unused")
    private int Wings;
    protected double Feathers;
    public Package2(){
  
        this.Beak = "One";
        this.Wings = 2;
        this.Feathers = 200;
     }
    
     public Package2(String Beak, int Wings, double Feathers ){
      
        this.Beak = Beak;
        this.Wings = Wings;
        this.Feathers = Feathers;
     }
     public void Dive() {
        System.out.println("Bird is diving at prey.");
    }
    
    public void Dive(String animal) {
        System.out.println( animal +"is diving at you");
    }
    }