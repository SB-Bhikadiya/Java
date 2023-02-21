import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="pro_13" width=1000 height=500></applet>*/

public class pro_13 extends Applet implements ActionListener {
    private Label label;
    private TextField textField;
    private Button button;

    public void init() {
        label = new Label("Enter a number: ");
        textField = new TextField(10);
        button = new Button("Print");
        add(label);
        add(textField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        int num = Integer.parseInt(input);

        for (int i = 1; i <= num; i++) {
            System.out.println("Object " + i);
        }
    }

}
