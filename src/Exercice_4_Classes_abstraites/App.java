package Exercice_4_Classes_abstraites;

/**
 * @author med20
 **/
class App{
    public static void main(String[] args) {
        Employe employeIngenieur = new Ingenieur("Fatiha","Benani","fatiha@gmail.ma","07025696",8000,"Backend");

        Employe employeManager = new Manager("Mohamed","benyghil","med@gmail.ma","06256555",10000,"Informatique");

        System.out.println("*********** Affichage Information d'un Ingenieur ***********");

        System.out.println(employeIngenieur.toString());

        System.out.println("*********** Augmentation de 15% de salaire d'un Ingenieur ***********");

        employeIngenieur.calculerSalaire();

        System.out.println("Salaire : "+employeIngenieur.getSalaire());


        System.out.println("*********** Affichage Information d'un Manager ***********");

        System.out.println(employeManager.toString());

        System.out.println("*********** Augmentation de 20% de salaire d'un Manager ***********");

        employeManager.calculerSalaire();

        System.out.println("Salaire : "+employeManager.getSalaire());
    }
}