package Exo1;



import java.util.ArrayList;

// Exercice 1 - ArrayList (Niveau Facile) :

// Objectif : Manipuler des ArrayList en Java.

// Énoncé : Créez une classe ArrayListUtil avec une méthode statique creerListe qui crée une ArrayList d'entiers. Ensuite, créez une autre méthode statique calculerSomme qui prend une ArrayList d'entiers comme argument et renvoie la somme de tous les éléments.


public class ArrayListUtil {
    // Ici je déclare une méthode ListeEntiers qui renvoie une instance d'ArrayList contenant des entiers.
    public static ArrayList <Integer> ListEntiers (){
        //ici j'instancie un objet qui est une liste appellé entiers et qui contiendra des Interger . créée sur le modele d'une ArrayList .
        ArrayList<Integer> entiers = new ArrayList<>();
        int entier1 = 1;
        int entier2 = 2;
        int entier3 = 3;
        int entier4 = 4;


        // J'ajoute ces entiers à la liste entiers
        entiers.add(entier1);
        entiers.add(entier2);
        entiers.add(entier3);
        entiers.add(entier4);

         // Retournez la liste
         return entiers;


    }
     
}