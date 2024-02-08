package Exercice_3;

/**
 * @author med20
 **/
public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void emettreSon(){
        System.out.println("Le véhicule émet un son inconnu");
    }

    public String afficherInformations() {
        return getClass().getSimpleName() +" { "+
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
