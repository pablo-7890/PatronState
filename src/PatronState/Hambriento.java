package PatronState;


public class Hambriento implements State {
    private Pou pou;
    
    @Override
    public void jugar(){
      System.out.println("no quiero jugar!");  
    }
    @Override
    public void comer(){
        System.out.println("Siiii, muero de hambre!");   
        pou.setState((State) new Ansioso());
    }
    @Override
    public void dormir(){
        System.out.println("No quiero dormir!");     
    }
    
    @Override
    public void pasear(){
        System.out.println("No quiero salir a pasear!");     
    }
    
    @Override
    public void setPou(Pou pou){
        this.pou = pou;
    }
    
}
