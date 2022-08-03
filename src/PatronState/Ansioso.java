package PatronState;


public class Ansioso implements State{
    
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
        System.out.println("No quiero dormir!");  
    }
    
    @Override
    public void pasear(){
        System.out.println("Siii, a pasear !");  
        pou.setState((State) new Aburrido());
    }
    
   
    @Override
    public void setPou(Pou pou){
        this.pou = pou;
    }
    
}
