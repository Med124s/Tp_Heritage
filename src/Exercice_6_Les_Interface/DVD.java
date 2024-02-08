package Exercice_6_Les_Interface;

/**
 * @author med20
 **/
public class DVD implements Empruntable{

    private String titre,réalisateur;
    private boolean emprunt ;

    public DVD(String titre, String réalisateur) {
        this.titre = titre;
        this.réalisateur = réalisateur;
        emprunt = false;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRéalisateur() {
        return réalisateur;
    }

    public void setRéalisateur(String réalisateur) {
        this.réalisateur = réalisateur;
    }

    @Override
    public void emprunter() {
        if (!emprunt) {
            System.out.println("Emprunt du DVD : " + titre);
            emprunt = true;
        } else {
            System.out.println("Le DVD " + titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if(emprunt){
            System.out.println("Retour du DVD : " + titre);
            emprunt = false;
        }
        else
            System.out.println("Le DVD " + titre + " n'est pas emprunté.");
    }
}
