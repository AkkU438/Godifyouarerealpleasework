package Reptiles;

public class Snake extends Scales {
    @SuppressWarnings("unused")
    private String Throwaway;
    public String Throwaway2;
    protected String Throwaway3;

    public Snake(){
    
        System.out.println("Scales haven't been passed down");
    }
        
    public Snake( String name,String Throwaway2){
        super(name);
        System.out.println( Throwaway2 +" has inherited scales ");
    }

    public void abstractMethod(){
        System.out.println("Scales have been passed down");
    }

}
