package Exercice_4_Classes_abstraites;

/**
 * @author med20
 **/
public class Manager extends Employe {
    private String service;
    private static final double Taux_AUGMENTATION = 20;

    public Manager() {
    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service =service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    protected double calculerSalaire() {
        double augmentation = salaire * (Taux_AUGMENTATION/100);
        return salaire+=augmentation;
    }

    @Override
    public String toString() {
        return super.toString()+
                "service='" + service + '\'' +
                '}';
    }
}

