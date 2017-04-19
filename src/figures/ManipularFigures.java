
package figures;

import java.util.Arrays;
import piles.GenericPila;

public class ManipularFigures {

    public double mitjanaPerimetres(GenericPila<Figura> figura) {
        
        double sumatotal = 0;
        
        for (Figura i : figura.toArray(Figura.class)) {
            sumatotal += i.perimetre();
        }
        return sumatotal / figura.mida();
    }

    public <T> T[] arrayOrdenat(T[] t) {
        Arrays.sort(t);
        return t;
    }
}