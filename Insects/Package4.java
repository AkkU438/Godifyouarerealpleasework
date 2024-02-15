package Insects;

public class Package4 {
 public String Teeth;
 @SuppressWarnings("unused")
private int Potency;
 protected double Fangs;
    
 public Package4(){
  
    this.Teeth = "Many";
    this.Potency = 20;
    this.Fangs = 2;
 }

 public Package4(String Teeth, int Potency, double Fangs ){
  
    this.Teeth = Teeth;
    this.Potency = Potency;
    this.Fangs = Fangs;
 }
 public void lunge() {
    System.out.println("Animal is lunging.");
}

public void lunge(String animal) {
    System.out.println( animal +"is lunging at you");
}
}




