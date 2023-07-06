import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class Saisie {
    public static void main(String[] args){
        JFrame fenetre = new JFrame("Boutons");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(300, 200);
        fenetre.setLocationRelativeTo(null);
        JTextField field = new JTextField();
        JTextArea textArea = new JTextArea();
        field.getDocument().addDocumentListener(new MyDocumentListener(field, textArea));
        textArea.setEditable(false);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.GREEN);
        textArea.setLineWrap(true);
        field.setFont(new Font("Arial", Font.PLAIN, 15));
        textArea.setFont(new Font("Arial", Font.PLAIN, 15));
        fenetre.add(field, BorderLayout.SOUTH);
        fenetre.add(textArea, BorderLayout.CENTER);
        fenetre.setVisible(true);
    }
}