package Exercice_3;

/**
 * @author med20
 **/
public class App {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule("Bateau",4545);
        Vehicule voiture = new Voiture("Dacia",56200,"stepway",2008);
        Vehicule moto = new Moto("C90",5500,"Docker",1000);
        Vehicule avion = new Avion("RAM",9999520,"RAM Maroc",1002636);

        System.out.println("**** Appel method emettreSon ****");

        vehicule.emettreSon();
        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        System.out.println("**** afficher information ****");
        System.out.println(vehicule.afficherInformations());
        System.out.println(voiture.afficherInformations());
        System.out.println(moto.afficherInformations());
        System.out.println(avion.afficherInformations());
    }

}
