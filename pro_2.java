
import java.applet.Applet;
import java.awt.*;
/*<applet code="pro_2" width=1000 height=500></applet>*/

public class pro_2 extends Applet {
    public void paint(Graphics g) {       
        g.setColor(Color.RED);
        g.drawOval(46,26,240,240);
        int[] x={160,260,70};
        int[] y={30,220,220};
        g.setColor(Color.BLUE);
        g.drawPolygon(x,y,3);
    }
}
