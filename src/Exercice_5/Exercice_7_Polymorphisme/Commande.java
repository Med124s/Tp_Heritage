package Exercice_5.Exercice_7_Polymorphisme;

/**
 * @author med20
 **/
// Classe Commande
class Commande {
    private double montantCommande;
    private Paiement moyenPaiement;

    public Commande(double montantCommande, Paiement moyenPaiement) {
        this.montantCommande = montantCommande;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        moyenPaiement.effectuerPaiement(montantCommande);
    }
}