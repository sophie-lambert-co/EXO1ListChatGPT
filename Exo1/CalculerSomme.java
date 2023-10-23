package Exo1;



import java.util.ArrayList;

// Ensuite, créez une autre méthode statique calculerSomme qui prend une ArrayList d'entiers comme argument et renvoie la somme de tous les éléments.

public class CalculerSomme {
   public int sommedesentiers(ArrayList <Integer> ListEntiers){
  
    // Vérifier que la liste a au moins 2 éléments pour effectuer une addition.@interface
    if ( ListEntiers.size() < 2) {
        System.out.println ("l'addition est possible"); 
        return 0;
    }

    // Initilaiser la somme à Zero
    int somme = 0;
     
        // Je parcours la liste et je cacule la somme
        for(int element : ListEntiers){
            somme += element;
        }
    // Je retourne la somme 
    return somme;
           
        }
    }
    

   
    

