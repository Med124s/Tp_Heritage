package Exercice_4_Classes_abstraites;

/**
 * @author med20
 **/
public class Ingenieur extends Employe{
    private String spécialité;
    private static final double TAUX_AUGMENTATION = 15;
    public Ingenieur() {

    }

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String spécialité) {
        super(nom, prenom, email, telephone, salaire);
        this.spécialité = spécialité;
    }

    @Override
    public double calculerSalaire() {
        double augm = salaire * (TAUX_AUGMENTATION/100);
        salaire +=augm;
        return salaire;
    }
    @Override
    public String toString() {
        return super.toString()+
                "spécialité='" + spécialité + '\'' +
                '}';
    }
}
