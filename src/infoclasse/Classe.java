package infoclasse;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Classe <N>{

    
    private N tipus;

    public Classe(N n) {
        this.tipus = n;
    }

    public N getTipus() {
        return tipus;
    }

    public void setTipus(N tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Classe{" + "tipus=" + tipus + '}';
    }
  
    
    
    
    
}
