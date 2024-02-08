package Exercice_2;

/**
 * @author med20
 **/
public class App {
    public static void main(String[] args) {

        Personne adherent = new Adherent("Monir","Hafass","m@gmail.com",
                       "+212 620256985",25,"A200");

        Personne auteur = new Auteur("Mohamed","Ben-Yghil","med@gmail.com",
                                    "+212 636965841",45,"W200");

        Livre livre = new Livre(100,"The Rational man", (Auteur) auteur);

        System.out.println("************** affichage les Infos des classes ****************");
        System.out.println(adherent);
        System.out.println(livre);
    }
}
