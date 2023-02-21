/*<applet code="pro_11" width=1000 height=500></applet>*/

import java.awt.*;
import java.applet.*;

public class pro_11 extends Applet implements Runnable {
    private int sunY;
    private Thread anim;

    public void init() {

        sunY = getSize().height / 2;

        anim = new Thread(this);
        anim.start();
    }

    public void paint(Graphics g) {
        int width = getSize().width;
        int height = getSize().height;

        g.setColor(new Color(255, 192, 96));
        g.fillRect(0, 0, width, height);

        g.setColor(Color.yellow);
        int sunRadius = Math.min(width, height) / 4;
        int sunX = width / 2 - sunRadius;
        g.fillOval(sunX, sunY, sunRadius * 2, sunRadius * 2);

        g.setColor(new Color(34, 139, 34));
        int horizonY = height * 2 / 3;
        g.fillRect(0, horizonY, width, height - horizonY);
    }

    public void run() {
        while (true) {
            sunY++;
            if (sunY > getSize().height) {
                sunY = -sunY / 2;
            }
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }
}
