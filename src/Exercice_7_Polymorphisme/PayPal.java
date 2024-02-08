package Exercice_7_Polymorphisme;

/**
 * @author med20
 **/
// Classe dérivée PayPal
class PayPal extends Paiement {
    private String adresseEmail;

    public PayPal(double montant, String numeroTransaction, String adresseEmail) {
        super(montant, numeroTransaction);
        this.adresseEmail = adresseEmail;
    }

    @Override
    public void effectuerPaiement(double montant) {
        super.effectuerPaiement(montant);
        System.out.println("Paiement par PayPal avec l'adresse email : " + adresseEmail);
    }
}
