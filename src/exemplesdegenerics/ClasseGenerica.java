package exemplesdegenerics;

public class ClasseGenerica<T1, T2> {
    private T1 t1;
    private T2 t2;

   public ClasseGenerica(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }


    /**
     * @return the t1
     */
    public T1 getT1() {
        return t1;
    }

    /**
     * @param t1 the t1 to set
     */
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    /**
     * @return the t2
     */
    public T2 getT2() {
        return t2;
    }

    /**
     * @param t2 the t2 to set
     */
    public void setT2(T2 t2) {
        this.t2 = t2;
    }
    
    public String nomClasseT1(){
        return t1.getClass().getSimpleName();
    }
    
    public String nomClasseT2(){
        return t2.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "ClasseGenerica{" + "t1=" + t1 + ", t2=" + t2 + '}';
    }
    
}