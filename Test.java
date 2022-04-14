import java.util.*;

public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        Random r = new Random();

    
        System.out.println("---------------------------------------");
        System.out.println("| Bienvenue dans le jeu du juste prix |");
        System.out.println("---------------------------------------");

        System.out.println("choisissez un prix max");
        int max = scan.nextInt();
        System.out.println("choisissez un prix min");
        int min = scan.nextInt();
        int justeprix = r.nextInt(max+min)+min;

        System.out.println();
        System.out.println("Quel est votre nom ?");
        String Nom = scan.next();
        System.out.println("Bonjour "+ Nom.toUpperCase());
        System.out.println("Essaye de trouver le juste prix si tu peux.");
        int prix = scan.nextInt();

        // Timer chrono = new Timer();
        // chrono.schedule(new Time(),1000,1000);

        while(prix != justeprix) {
            if(prix > justeprix) {
                System.out.println("C'est moins");
                prix = scan.nextInt();
                count++;
            }else if (prix < justeprix){
                System.out.println("C'est plus");
                prix = scan.nextInt();
                count++;
            }
        }
        // chrono.cancel();
        if(count <= 10) {
            System.out.println("Vous ête un As de la gachette");
        }else if(count >= 20){
            System.out.println("tu peux mieux faire t'inquiète pas");
        }
        System.out.println();
        System.out.println("bravo " + Nom+ ", le juste prix est "+ prix +" tu l'as trouvé après "+ count +" tentative(s)"); 
    }
}