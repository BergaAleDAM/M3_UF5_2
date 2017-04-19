
package piles;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class GenericPila<T> implements IPila<T> {

    private ArrayList<Node> nodos;
    private Node nodo = null;
 private T valor = null;

  
    @Override
    public void afegir(T t) {
        nodos.add(new Node(nodo, t));
      
    }

 
    
    @Override
    public T treure() {
        
        nodo = (Node) nodos.listIterator();
        nodos.remove(nodos.listIterator());
        
        return (T) nodo.t;
    }

    
    @Override
    public void buidar() {
        nodos = null;

    }

    
    @Override
    public T[] toArray(Class t) {
         T[] llista = (T[]) Array.newInstance(t, nodos.size());
        int auxi = nodos.size(); 
        Node aux = nodo; 
        
        while(aux != null){
            aux = aux.pare;
            llista[--auxi] = (T) aux.t;
            
        }
        return llista;
    }

    @Override
    public int mida() {
        return nodos.size();
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
