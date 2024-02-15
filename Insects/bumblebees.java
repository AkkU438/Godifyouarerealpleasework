package Insects;

public class bumblebees extends Package4 {
    public String Fly = "This animal is flying towards you";
    private String Hivemind = "This animals has a hivemind";
    protected String Color;
    public static String count = "There are over 250 types of bumblebees";
    
    
    public bumblebees( String teeth, int potency, double fangs){
        super( teeth,  potency,  fangs);
        System.out.println(Fly);
    }
    public bumblebees(){
        super();
        System.out.println(Fly);
    }
    
    public void lunge() {
        System.out.println("Bumblebees are lunging.");
    }
    
    public void Hivemind() {
        System.out.println(Hivemind);
    }
    public void Hivemind(String value) {
        Hivemind = value;
    }
    
}

