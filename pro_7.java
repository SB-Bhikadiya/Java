import java.awt.*;
/*<applet code="pro_7" height=500 width=500></applet>*/
import java.applet.Applet;

public class pro_7 extends Applet {
  public void paint(Graphics g) {
g.setColor(Color.RED);
g.fillOval(80, 70, 150, 150);
g.setColor(Color.BLACK);
g.fillOval(120, 120, 15, 15);
g.fillOval(170, 120, 15, 15);
g.drawArc(130, 180, 50, 20, 180, 180);
  }
}