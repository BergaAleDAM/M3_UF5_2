package infoclasse;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InfoClasse <N> {

    
    private Classe<N> e;

    public InfoClasse(Classe<N> e) {
        this.e = e;
    }
   
    public String nomSuperClasse() {
        return e.getClass().getSuperclass().getSimpleName();
    }

    public String nomSencerClasse() {
        return e.getClass().getCanonicalName();
    }

    public String nomNomesClasse() {
        return e.getClass().getSimpleName();
    }

    public Field[] arrayAtributsClasse() {

        return e.getClass().getDeclaredFields();
    }

    public Method[] arrayMetodesClasse() {

        return e.getClass().getMethods();
    }

    public String[] arrayNomAtributsClasse() {

        Field[] atributosField = arrayAtributsClasse();
        String[] atributosNombre = new String[atributosField.length];
        for (int i = 0; i < atributosField.length; i++) {
            atributosNombre[i] = atributosField[i].getName();
        }

        return atributosNombre;

    }

    public String[] arrayNomMetodesClasse() {

        Method[] metodos = arrayMetodesClasse();
        String[] nomMetodos = new String[metodos.length];

        for (int i = 0; i < metodos.length; i++) {
            nomMetodos[i] = metodos[i].getName();
        }

        return nomMetodos;
    }

    public int modificadorField(String atribut) {

        String[] atributos = arrayNomAtributsClasse();

        for (String atributo : atributos) {
            if (atributo.equals(atribut)) {
                return atributo.getClass().getModifiers();
            }
        }
        return 0;

    }

    public int modificadorMetodes(String metodo) {
        
        String[] metodos = arrayNomAtributsClasse();

        for (String metodo1 : metodos) {
            if(metodo1.equals(metodo)){
                return metodo1.getClass().getModifiers();
            }
        }
        return 0;

    }
    
    public void ejecutaMetodo(Method metodo){
        
        try {
            metodo.invoke(e, (Classe <N>) null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(InfoClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object crearInstancia() throws InstantiationException, IllegalAccessException{
        
        return e.getClass().newInstance();
    }
    
    public Object clon() throws CloneNotSupportedException{
    
        return super.clone();
        
    }   

}