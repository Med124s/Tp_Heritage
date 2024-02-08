package Exercice_5.Exercice_7_Polymorphisme;

/**
 * @author med20
 **/
// Classe principale pour tester
public class GestionPaiementApp {
    public static void main(String[] args) {
        // Création d'instances de Commande avec différents moyens de paiement
        CarteCredit carte = new CarteCredit(100.0, "123456", "1234-5678-9012-3456");
        PayPal paypal = new PayPal(50.0, "987654", "user@example.com");

        Commande commande1 = new Commande(100.0, carte);
        Commande commande2 = new Commande(50.0, paypal);

        // Appel de la méthode processPayment() pour chaque commande
        commande1.processPayment();
        commande2.processPayment();
    }
}