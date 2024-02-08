package Exercice_5;

/**
 * @author med20
 **/
class App{
    public static void main(String[] args) {
        System.out.println("\n******** Figure Cercle ********\n");

        Figure figure = new Cercle("Cercle",3);
        figure.calculerAire();
        figure.calculerPerimetre();

        figure.afficherDetails();

        System.out.println("\n******** Figure Rectangle ********\n");
        Figure figure2 = new Rectangle("Rectangle",5,3);
        figure2.calculerAire();
        figure2.calculerPerimetre();

        figure2.afficherDetails();
    }
}