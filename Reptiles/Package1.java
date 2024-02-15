package Reptiles;
//Four packages check
//Now for this package I think im gonna do 2 abstracts classes 
//2 abstract classes done
abstract class Scales {
  public String Scales = "Scales are a small plate or shield forming part of the outer skin layers of certain animals";
  private int Durability = 20;    
  protected String Scales2 = "Scales have been passed down";

  public Scales(){
    System.out.println("Scales haven't been passed down");
  }

  public Scales(String name){
    System.out.println( name +" has inherited scales ");
  }
  public int getPrivateMember() {
    return Durability;
}
public double calculateScaleStrength(double sideLength) {
  return sideLength * sideLength;
}
public double calculateScaleStrength(double length, double width) {
  return length * width;
}
  public abstract void abstractMethod();
  
  public void abstractMethod(int volume) {
    System.out.println("Testing testing testing " + volume);
}
  
}





abstract class Claws {
  public String Claws = "Claws are narrow, arched structure that curves downward from the end of a digit";
  private int Durability = 40;    
  protected String Claws2 = "Claws have been passed down";

  public Claws(){
    System.out.println("Claws haven't been passed down");
  }

  public Claws(String name){
    System.out.println( name +" has inherited claws ");
  }
  public int getPrivateMember() {
    return Durability;
}
public double calculateClawStrength(double sideLength) {
  return sideLength * sideLength;
}
public double calculateClawStrength(double length, double width) {
  return length * width;
}
  public abstract void abstractMethod();

    
}