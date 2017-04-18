package exemplesdegenerics;

import java.util.Date;

public class MainClass {

    public static void main(String[] args) {
        ClasseGenerica<Integer, String> cg = new ClasseGenerica<>(5, "hola");

        System.out.println("t1= " + cg.getT1());
        System.out.println("t2= " + cg.getT2());
        System.out.println("Classe del tipus genèric T1: " + cg.nomClasseT1());
        System.out.println("Classe del tipus genèric T2: " + cg.nomClasseT2());

        ClasseMetodeAmbParametreGeneric cmg = new ClasseMetodeAmbParametreGeneric();
        System.out.println("mètode amb paràmetre genèric: " + cmg.met1(new ClasseGenerica<>(10.5, new Date())));

        ClasseNoGenericaAmbMetodeGeneric cng = new ClasseNoGenericaAmbMetodeGeneric();

        cng.metGeneric2(cg);

    }
}
