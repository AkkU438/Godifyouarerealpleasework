package Mammals;

public class Humans implements Sweat {
    @SuppressWarnings("unused")
    private String Throwaway;
    public String Throwaway2;
    protected String Throwaway3;

    public Humans(){
  
        this.Throwaway = "One";
        this.Throwaway2 = "2";
        this.Throwaway3 = "200";
     }
    
     public Humans(String Throwaway, String Throwaway2, String Throwaway3 ){
        this.Throwaway = Throwaway;
        this.Throwaway2 = Throwaway2;
        this.Throwaway3 = Throwaway3;
     }


     public void eccerineSweatGlands() {
        System.out.println("Humans sweat");
    }

    public void eccerineSweatGlands(String f) {
        System.out.println("Humans sweat" + f);
    }

}