import java.util.HashMap;
import java.util.Scanner;

public class Dico {
    // programme incomplet , petit bug à regler 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String Mot,def;
        HashMap<String,String> Dictionnaire =  new HashMap<String , String >();
        
        System.out.println(" combien de mot et définition voulez vous stocker dans le Dictionaire ? ");
        int Value = scan.nextInt();
            while (i < Value){
                i++;
                System.out.println("Entrez le mot :  ");
                Mot = scan.nextLine();
                System.out.println("Entrez la définition du mot :  ");
                def = scan.nextLine();
                Dictionnaire.put(Mot, def);
            }
            System.out.println("Création du dictionnaire");
            System.out.println("Téléchargement .............");
            try {
                // ce bout de code vient de StackOverFlow
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(Dictionnaire);
    }
}
