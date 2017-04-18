package exemplesdegenerics;


public class ClasseNoGenericaAmbMetodeGeneric {

    public <T1> void metGeneric() {
        System.out.println("metGeneric");
    }

    public <T1> String metGeneric2(T1 t1) {
        return t1.toString();
    }

    public <T1> T1 novaInstancia(Class<T1> t1) throws InstantiationException, IllegalAccessException {
        return t1.newInstance();
    }
   

    public <T1, T2 extends Number> T2 metGeneric4(T1 t1, T2 t2) {
        return t2;
    }

}
