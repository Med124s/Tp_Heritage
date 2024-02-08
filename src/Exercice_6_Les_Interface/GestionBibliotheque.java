package Exercice_6_Les_Interface;

/**
 * @author med20
 **/
public class GestionBibliotheque {

    public static void main(String[] args) {
        // Création d'instances de Livre, DVD et Utilisateur
        Livre livre1 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        Utilisateur utilisateur1 = new Utilisateur("Alice");

        // Appels de la méthode emprunterObjet()
        utilisateur1.emprunterObjet(livre1);
        utilisateur1.emprunterObjet(dvd1);

        // Appels de la méthode retourner() sur certains objets empruntés
        livre1.retourner();
        dvd1.retourner();


    }
}
