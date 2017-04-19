
package piles;

/**
 *
 * @author Alejandro
 */

    public interface IPila<T> {

  
    public void afegir(T t);
    
   
    public T treure();
    
   
    public void buidar();
    
    
    public int mida();
    
    
    public T[] toArray(Class<T> t);
    
}

