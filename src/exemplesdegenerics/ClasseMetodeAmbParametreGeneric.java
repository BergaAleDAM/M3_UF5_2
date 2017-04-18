package exemplesdegenerics;


public class ClasseMetodeAmbParametreGeneric {
    
    public String met1(ClasseGenerica<?,?> cgen){        
        return cgen.toString();
    }

}