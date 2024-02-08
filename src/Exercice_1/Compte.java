package Exercice_1;

/**
 * @author med20
 **/

public class Compte {
    private String numero;
    private double solde;
    private static int nbCompte = 0;

    public Compte() {
        numero = "";
        solde = 0;
        nbCompte++;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        if(montant<0)
            throw new RuntimeException("Montant doit etre > 0");
        else
            solde+=montant;
    }
    public void retirer(double montant){
        if(montant<0)
            throw new RuntimeException("Montant doit etre > 0");
        else if(montant>solde){
            throw new RuntimeException("le Solde est insuffisant.");
        }
        else
            solde-=montant;
    }

    public String afficherCompteInfo() {
        return "Exercice_1.Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }
    public static void afficherNbComptes(){
        System.out.println("Numbers of accounts: "+nbCompte);
    }
}

/* Programme principal main pour tester les Comptes*/

class Main{
    public static void main(String[] args) {
        System.out.println("****************** COMPTE 1 ******************");
        Compte compte1 = new Compte();
        compte1.setNumero("C100");
        compte1.setSolde(3500);
        compte1.deposer(1000);
        compte1.retirer(2000);

        System.out.println(compte1.afficherCompteInfo());

        System.out.println("****************** COMPTE 2 ******************");
        Compte compte2 = new Compte();
        compte2.setNumero("C101");
        compte2.setSolde(5200);
        compte2.deposer(3200);
        //compte2.retirer(30000); // error sold insuffisant
        compte2.retirer(8300); // error sold insuffisant

        System.out.println(compte2.afficherCompteInfo());

        Compte.afficherNbComptes();
    }
}
