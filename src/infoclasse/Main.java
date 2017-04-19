package infoclasse;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
        
        
        Classe<Integer> classe = new Classe<>(5);

        
        InfoClasse ic = new InfoClasse(classe);
        
        System.out.println(ic.nomNomesClasse());
        System.out.println(ic.nomSuperClasse());
        System.out.println(ic.nomSencerClasse());
        
        
        ic.crearInstancia();
    }

}
