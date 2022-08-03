package PatronState;

import java.util.Timer;
import java.util.TimerTask;


public class Durmiendo implements State {
    
    private Pou pou;
    
    @Override
    public void jugar(){
   
    }
    
    @Override
    public void comer(){
          
    }
    
    @Override
    public void dormir(){
        
    }
    
    @Override
    public void pasear(){
        
    }

    @Override
    public void setPou(Pou pou){
        this.pou = pou;
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                Durmiendo.this.pou.setState(new Hambriento());
            }
            
        }, 5000);
        
    }
    
    
}
