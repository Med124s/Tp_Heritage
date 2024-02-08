package Exercice_3;

/**
 * @author med20
 **/
public class Voiture extends Vehicule{
    private String modele;
    private int annee;


    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voitrure vrombit");
    }

    @Override
    public String afficherInformations() {
        return super.afficherInformations()+
                ", modele='" + modele + '\'' +
                ", annee='" + annee + '\''+
                '}';
    }
}
