package Exercice_5.Exercice_7_Polymorphisme;

/**
 * @author med20
 **/
// Classe de base Paiement
class Paiement {
    protected double montant;
    protected String numeroTransaction;

    public Paiement(double montant, String numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué avec succès.");
    }
}