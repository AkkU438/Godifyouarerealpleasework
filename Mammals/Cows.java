package Mammals;

public class Cows implements Birth {
    @SuppressWarnings("unused")
    private String Throwaway;
    public String Throwaway2;
    protected String Throwaway3;
 
    public Cows(){
  
        this.Throwaway = "One";
        this.Throwaway2 = "2";
        this.Throwaway3 = "200";
     }
    
     public Cows(String Throwaway, String Throwaway2, String Throwaway3 ){
        this.Throwaway = Throwaway;
        this.Throwaway2 = Throwaway2;
        this.Throwaway3 = Throwaway3;
     }


    public void liveBirth() {
        System.out.println("Cows have live birth");
    }

    public void liveBirth(String l) {
        System.out.println("Cows have live birth"+l);

    }
   
   
   

}
