package Exercice_5;

import java.util.Map;

/**
 * @author med20
 **/
public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        aire = (Math.PI * Math.pow(rayon,2));
        return aire;
    }

    @Override
    public double calculerPerimetre() {
        perimetre = (2 * Math.PI * rayon);
        return perimetre;
    }

}
