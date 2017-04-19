
package figures;


public abstract class Figura implements Comparable<Figura>{

    private String nom;

  
    public Figura(String nom) {
        this.nom = nom;
    }

  
    public Figura() {

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public abstract double area();

 
    public abstract double perimetre();


    @Override
    public int compareTo(Figura o) {
        double areaObjecteActual = this.area(), areaObjecteParametre = o.area();
        int masGrande;
        if(areaObjecteActual > areaObjecteParametre){
            masGrande = 1;
        }else if(areaObjecteActual < areaObjecteParametre){
            masGrande = -1;
        }else{
            masGrande = 0;
        }
        return masGrande;
    }

    @Override
    public String toString() {
        return "Figura ->" + " nom=" + nom ;
    }
}