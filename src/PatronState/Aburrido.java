package PatronState;


public class Aburrido implements State{
    private Pou pou;

    
    
    @Override
    public void jugar(){
      System.out.println("Siii! a jugar");  
      pou.setState(new Cansado());
    }
    @Override
    public void comer(){
        System.out.println("No tengo hambre!");   
        
    }
    @Override
    public void dormir(){
        System.out.println("No quiero dormir!");     
    }
    
    @Override
    public void pasear(){
        System.out.println("No quiero pasear!");     
    }
    

    @Override
    public void setPou(Pou pou){
        this.pou = pou;
    }
    
    
}
