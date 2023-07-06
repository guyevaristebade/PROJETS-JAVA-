import java.io.*;

public class Copie {
    private String source;
    private String destination;

    public Copie(String s , String d) {
        this.source = s;
        this.destination = d;
    }

        public static void main(String[] args) {
            try {
                CopieFichierTexte copie = new CopieFichierTexte(args[0], args[1]);
                copie.copiecolle();  
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("vous avez oubliez les deux fichier texte");
            } 
        }
    
    public void copiecolle() {            
        try {

            FileReader file = new FileReader(this.source);
            BufferedReader buffi = new BufferedReader(file);
            FileWriter dest = new FileWriter(this.destination);
            BufferedWriter buffiDest = new BufferedWriter(dest);
            String ligne; 
            while(buffi.read() != -1){
                ligne=buffi.readLine();
                buffiDest.write(ligne);
                buffiDest.newLine();
            }
                buffi.close();
                buffiDest.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
