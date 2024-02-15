package Insects;

public class ants extends Package4{
    public String Fly = "This animal is flying towards you";
    private String Hivemind = "This animals has a hivemind";
    protected String Color;
    final String Survival = "Ants constantly wage war on other ant species everyday, with millions of them dying.";
    public static String count = "There are 20 quadrillion ants";
   
    public ants( String teeth, int potency, double fangs){
        super( teeth,  potency,  fangs);
        System.out.println(Fly);
    }
    public ants(){
        super();
        System.out.println(Fly);
    }
   
    public void lunge() {
        System.out.println("ants are lunging.");
    }
   
   
    public void Hivemind() {
        System.out.println(Hivemind);
    }
    public void Hivemind(String value) {
        Hivemind = value;
    }

}