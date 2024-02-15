package Reptiles;

public class Dragon extends Claws {
    @SuppressWarnings("unused")
    private String Throwaway;
    public String Throwaway2;
    protected String Throwaway3;
   
    public  Dragon(){
    
        System.out.println("Scales haven't been passed down");
    }
        
    public  Dragon( String name,String Throwaway2){
        super(name);
        System.out.println( Throwaway2 +" has inherited scales ");
    }
   
    public void abstractMethod(){
        System.out.println("Claws have been passed down");
    }

    public void abstractMethod(String Throwaway2){
        
        System.out.println("Claws have been passed down");
    }


    
}
