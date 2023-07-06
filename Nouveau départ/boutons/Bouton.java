import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Bouton {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Boutons");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(300, 200);
        fenetre.setLocationRelativeTo(null);

        JButton bouton1 = new JButton("Bouton 1");
        JButton bouton2 = new JButton("Bouton 2");
        JButton bouton3 = new JButton("Bouton 3");
        JButton bouton4 = new JButton("Bouton 4");
        JButton bouton5 = new JButton("Bouton 5sssssssssssssssssssssssssssssssssssssssssssssssssssss");
        fenetre.add(bouton1,BorderLayout.NORTH);
        fenetre.add(bouton2,BorderLayout.SOUTH);
        fenetre.add(bouton3,BorderLayout.EAST);
        fenetre.add(bouton4,BorderLayout.WEST);
        fenetre.add(bouton5,BorderLayout.CENTER);
        fenetre.setVisible(true);
    }
}
