package Exo1;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
            // ici je viens chercher ma ListEntiers crée dans ArrayListUtil
              ArrayList<Integer> ListEntiers = ArrayListUtil.ListEntiers();

            // Je  créeune instance de la classe CalculerSomme pour calculer la somme des entiers.
            CalculerSomme calculateurSomme = new CalculerSomme();


             // J'appelle la méthode sommedesentiers pour calculer la somme de la liste d'entiers.
             int resultat = calculateurSomme.sommedesentiers(ListEntiers);
            System.out.println( "le resulat est :" + resultat);
              
    }
    
}
