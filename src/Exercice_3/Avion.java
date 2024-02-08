package Exercice_3;

/**
 * @author med20
 **/
public class Avion extends Vehicule{
    private String compagnie;
    private int vitessMax;


    public Avion(String nom, double prix,String compagnie, int vitessMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitessMax = vitessMax;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public int getVitessMax() {
        return vitessMax;
    }

    public void setVitessMax(int vitessMax) {
        this.vitessMax = vitessMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant");
    }
    @Override
    public String afficherInformations() {
        return super.afficherInformations()+
                ", compagnie='" + compagnie + '\'' +
                ", vitessMax=" + vitessMax +
                '}';
    }
}
