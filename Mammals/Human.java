package Mammals;

public class Human implements Birth {
    @SuppressWarnings("unused")
    private String Throwaway;
    public String Throwaway2;
    protected String Throwaway3;

    public Human(){
  
        this.Throwaway = "One";
        this.Throwaway2 = "2";
        this.Throwaway3 = "200";
     }
    
     public Human(String Throwaway, String Throwaway2, String Throwaway3 ){
      
        this.Throwaway = Throwaway;
        this.Throwaway2 = Throwaway2;
        this.Throwaway3 = Throwaway3;
     }


    public void liveBirth() {
        System.out.println("Humans have live birth");
    }

    public void liveBirth(String l) {
        System.out.println("Humans have live birth"+l);
    }

}
