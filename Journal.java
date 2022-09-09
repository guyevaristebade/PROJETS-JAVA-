import java.lang.*;
import java.util.Date;
import java.io.*;

public class Journal{
    public static void main(String[] args) {
        String ligne="";

        try {
            /**
             * on lit ce qui es taper au clavier 
            */
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader buffi = new BufferedReader(isr);
            /**
             * cette ligne signifie qu'on peux écrire à la suite de notre ficher
            */
            FileWriter file = new FileWriter(args[0],true); 
            BufferedWriter bufile = new BufferedWriter(file);
            
            /**
             * tant qu'une ligne ne contient pas le mot clé assez , on peut continuer à écrire au clavier.
            */
            while(!ligne.equals("assez!")){
                ligne = buffi.readLine();
                bufile.write(ligne);
                bufile.newLine();
            }
            bufile.newLine();

            bufile.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}