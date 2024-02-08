package Exercice_5;

/**
 * @author med20
 **/
public class Rectangle extends Figure {
    private double longeur, largeur;

    public Rectangle(String nom,double longeur, double largeur) {
        super(nom);
        this.longeur = longeur;
        this.largeur = largeur;
    }


    @Override
    public double calculerAire() {
        aire = longeur * largeur;
        return aire;
    }

    @Override
    public double calculerPerimetre() {
        perimetre = (2 * (longeur + largeur));
        return perimetre;
    }
}
