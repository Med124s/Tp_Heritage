package Exercice_5;

/**
 * @author med20
 **/
public abstract class Figure {
    protected String nom;
    protected double aire, perimetre;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getAire() {
        return aire;
    }

    public void setAire(double aire) {
        this.aire = aire;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }

    public  void afficherDetails(){
        System.out.println("Aire de "+getClass().getSimpleName()+" est :"+aire);
        System.out.println("Perimetre de "+getClass().getSimpleName()+" est :"+perimetre);
    }
}


