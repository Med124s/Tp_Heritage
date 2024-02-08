package Exercice_7_Polymorphisme;

/**
 * @author med20
 **/
// Classes dérivées CarteCredit
class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(double montant, String numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        super.effectuerPaiement(montant);
        System.out.println("Paiement par carte de crédit avec le numéro : " + numeroCarte);
    }
}