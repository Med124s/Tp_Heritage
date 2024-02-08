package Exercice_6_Les_Interface;

/**
 * @author med20
 **/
public class Livre implements Empruntable {

    private String titre,auteur;

    public  boolean estEmprunte;
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        estEmprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            System.out.println("Emprunt du livre : " + titre);
            estEmprunte = true;
        } else {
            System.out.println("Le livre " + titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (estEmprunte) {
            System.out.println("Retour du livre : " + titre);
            estEmprunte = false;
        } else {
            System.out.println("Le livre " + titre + " n'est pas emprunté.");
        }
    }
}
