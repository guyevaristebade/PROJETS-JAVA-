import java.util.LinkedList;
import java.util.List;

public class First{

    enum Fruit {
        ORANGE,
        BANANE,
        KIWI,
        KAKI
    }

    public static void main(String[] args) {
        // création de la liste 
        List<Fruit> Panier = new LinkedList<Fruit>();
        
        // ajout d'item dans la liste 
        Panier.add(Fruit.ORANGE);
        Panier.add(Fruit.BANANE);
        Panier.add(Fruit.KIWI);
        
        // affichage des items de la liste 
        for(Fruit p: Panier) {
        System.out.println(p);
        }
        
        // on remplace l'élément à l'index 1 
        Panier.add(1,Fruit.KAKI );

        System.out.println();
        // on affiche les différents éléments de la liste grace à leur index 
        //Panier.size() --> désigne la taille de la liste  
        for(int i = 0; i < Panier.size(); i++){
            System.out.println(Panier.get(i));
        }
    }
}