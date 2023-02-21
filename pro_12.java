import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="pro_12" width=1000 height=500></applet>*/

public class pro_12 extends Applet implements ActionListener {

    TextField t1, t2, t3, t4, t5, t6;
    Button b;
    Label l1, l2, l3,l4,l5,l6;

    public void init() {
        t1 = new TextField();
        t1.setBounds(100, 40, 150, 20);
        add(t1);

        t2 = new TextField();
        t2.setBounds(100, 60, 150, 20);
        add(t2);

        t3 = new TextField();
        t3.setBounds(100, 80, 120, 20);
        add(t3);

        t4 = new TextField();
        t4.setBounds(100, 100, 120, 20);
        add(t4);

        t5 = new TextField();
        t5.setBounds(100, 120, 120, 20);
        add(t5);

        t6 = new TextField();
        t6.setBounds(100, 140, 120, 20);
        add(t6);

        b = new Button("Click");
        b.setBounds(80, 200, 60, 20);
        add(b);

        l1 = new Label("n1");
        l1.setBounds(0, 40, 100, 20);
        add(l1);

        l2 = new Label("n2");
        l2.setBounds(0, 60, 100, 20);
        add(l2);

        l3 = new Label("summation");
        l3.setBounds(0, 80, 100, 20);
        add(l3);

        l4 = new Label("substraction");
        l4.setBounds(0, 100, 100, 20);
        add(l4);

        l5 = new Label("multiplication");
        l5.setBounds(0, 120, 100, 20);
        add(l5);

        l6 = new Label("division");
        l6.setBounds(0, 140, 100, 20);
        add(l6);

        b.addActionListener(this);

        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        t3.setText("" + (a + b));        
        t4.setText("" + (a - b));
        t5.setText("" + (a * b));
        t6.setText("" + (a / b));

    }
}