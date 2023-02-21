/*<applet code="pro_6" width=1000 height=500></applet>*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;

public class pro_6 extends Applet implements Runnable, ActionListener {
    private Thread clockThread;
    private Font clockFont;
    private Color bgColor, fontColor;
    private JComboBox<String> colorComboBox;
    
    public void init() {
        clockFont = new Font("Arial", Font.BOLD, 32);
        bgColor = Color.WHITE;
        fontColor = Color.BLACK;
    
        colorComboBox = new JComboBox<String>(new String[] { "Black", "Red", "Green", "Blue" });
        colorComboBox.addActionListener(this);
        add(colorComboBox);
    
        colorComboBox.setVisible(true);
    }
    
    
    public void start() {
        if (clockThread == null) {
            clockThread = new Thread(this);
            clockThread.start();
        }
    }
    
    public void stop() {
        if (clockThread != null) {
            clockThread.interrupt();
            clockThread = null;
        }
    }
    
    public void run() {
        while (clockThread != null) {
            try {
                Thread.sleep(10000);
                repaint();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        String selectedColor = (String) colorComboBox.getSelectedItem();
        if (selectedColor.equals("Black")) {
            fontColor = Color.BLACK;
        } else if (selectedColor.equals("Red")) {
            fontColor = Color.RED;
        } else if (selectedColor.equals("Green")) {
            fontColor = Color.GREEN;
        } else if (selectedColor.equals("Blue")) {
            fontColor = Color.BLUE;
        }
        repaint();
    }
    
    public void paint(Graphics g) {
        setBackground(bgColor);
        g.setColor(fontColor);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String timeString = dateFormat.format(new Date());
        g.setFont(clockFont);
        g.drawString(timeString, 10, 50);
        
        colorComboBox.setBounds(10, 60, 100, 20);
    }
}
