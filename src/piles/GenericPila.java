
package piles;

import java.lang.reflect.Array;


public class GenericPila<T> implements IPila<T> {

    private Node nodo = null;
    private int mida = 0;
    private T valor = null;

  
    @Override
    public void afegir(T t) {
        nodo = new Node(nodo, t);
        mida++;
    }

 
    
    @Override
    public T treure() {
        
        if (nodo != null) {
            valor = (T) nodo.t;
            nodo = nodo.pare;       
            mida--;
        } 
        return valor;
    }

    
    @Override
    public void buidar() {
        nodo = null;
        mida = 0;
    }

    
    @Override
    public T[] toArray(Class t) {
         T[] llista = (T[]) Array.newInstance(t, mida);
        int auxi = mida; 
        Node aux = nodo; 
        
        while(aux != null){
            aux = aux.pare;
            llista[--auxi] = (T) aux.t;
            
        }
        return llista;
    }

    @Override
    public int mida() {
        return mida;
    }


    
    
    private class Node {

        Node pare;
        T t;

       
        
        Node(Node pare, T t) {
            this.pare = pare;
            this.t = t;
        }
    }
}
