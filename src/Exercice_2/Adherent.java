package Exercice_2;

/**
 * @author med20
 **/
public class Adherent extends Personne {
    private String numAdherent;

    public Adherent(String nom, String prenom, String email, String tel, int age, String numAdherent){
        super(nom,prenom,email,tel,age);
        this.numAdherent = numAdherent;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", numAdherent='" + numAdherent + '\'' +
                '}';
    }
}
