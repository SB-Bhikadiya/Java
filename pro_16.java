
import java.applet.Applet;
import java.awt.*;
/*<applet code="pro_16" width=1000 height=500></applet>*/

public class pro_16 extends Applet {
    public void paint(Graphics g) {       
        g.setColor(Color.RED);
        g.drawOval(51,62,138,138);
        int[] x={120,210,163,77,30};
        int[] y={48,110,200,200,110};
        g.setColor(Color.BLUE);
        g.drawPolygon(x,y,5);


        g.setColor(Color.RED);
        g.drawOval(275,40,180,180);
        int[] x1={365,453,420,320,280};
        int[] y1={42,110,200,205,110};
        g.setColor(Color.BLUE);
        g.drawPolygon(x1,y1,5);
    }
}
