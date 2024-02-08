package Exercice_6_Les_Interface;

/**
 * @author med20
 **/
public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable object){
         object.emprunter();
    }
    public void retournerObject(Empruntable object){
        object.retourner();
    }
}
