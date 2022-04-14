import java.util.*;

public class PlusouMoins{
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
        
        if(count == 1) {
            System.out.println("« CROYEZ EN VOS RÊVES ET ILS SE RÉALISERONT PEUT-ÊTRE. CROYEZ EN VOUS ET ILS SE RÉALISERONT SÛREMENT.»    Martin Luther King");
        }else if(count >= 15){
            System.out.println("« LE PESSIMISTE DIT : JE CROIRAI QUAND JE LE VERRAI. » « L’OPTIMISTE DIT : JE LE VERRAI QUAND JE LE CROIRAI. »    Zig Ziglar ");
        }else{
            System.out.println("« SI VOUS POUVEZ LE RÊVER, VOUS POUVEZ LE FAIRE. »      Walt Disney");
        }
        
        System.out.println();
        System.out.println("bravo " + Nom + ", le juste prix est " + prix +" tu l'as trouvé après "+ count +" tentative(s)"); 
    }
}
