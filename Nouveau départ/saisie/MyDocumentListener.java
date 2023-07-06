import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MyDocumentListener implements DocumentListener {

    private JTextField field;
    private JTextArea area;

    public MyDocumentListener(JTextField field, JTextArea area) {
        this.field = field;
        this.area = area;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        updateField();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateField();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        updateField();
    }

    private void updateField() {
        String text = field.getText();
        area.setText(text);
    }
}