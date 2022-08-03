package PatronState;


public class Pou {
    private State estado;
    
    public Pou(){
        setState(new Hambriento());
    }
    
    public void setState(State estado){
        this.estado = estado;
        this.estado.setPou(this);
       
    }
    
    public void comer(){
        this.estado.comer();
    }
    
    public void jugar(){
        this.estado.jugar();
    }
    
    public void dormir(){
        this.estado.dormir();
    }
    
    public void pasear(){
        this.estado.pasear();
    }
 
}
