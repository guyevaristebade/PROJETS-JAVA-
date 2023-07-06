import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sirocco {
    public static void main(String[] args) {
         JFrame fenetre = new JFrame();
        fenetre.setSize(500 , 300);
        fenetre.setLocation(0, 0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel sirocco = new JLabel("Sirocco");
        sirocco.setFont(new Font("Arial", Font.PLAIN, 60));
        sirocco.setHorizontalAlignment(JLabel.RIGHT);
        fenetre.add(sirocco, BorderLayout.SOUTH);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
}
