package PatronState;


public class Cansado implements State{
    
    private Pou pou;

    
    @Override
    public void jugar(){
      System.out.println("no quiero jugar!");  
    }
    
    @Override
    public void comer(){
        System.out.println("No quiero comer!");   
    }
    
    @Override
    public void dormir(){
        System.out.println("Siii, que sueño tengo!");  
        pou.setState((State) new Durmiendo());
    }
    
    @Override
    public void pasear(){
        System.out.println("No quiero pasear");  
    }
    
   
    @Override
    public void setPou(Pou pou){
        this.pou = pou;
    }
    
}
