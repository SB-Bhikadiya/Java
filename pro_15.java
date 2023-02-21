/*<applet code="pro_15" width=1000 height=500>
 <param name="numberOfShapes" value="20">
 </applet>
*/
import java.awt.*;
import java.applet.*;
import java.util.Random;

public class pro_15 extends Applet {
  private int numObjects;
  private Color[] colors;
  private Random random;

  public void init() {
    // Initialize variables
    String numObjectsStr = getParameter("numObjects");
    numObjects = (numObjectsStr != null) ? Integer.parseInt(numObjectsStr) : 10;
    colors = new Color[numObjects];
    random = new Random();
    for (int i = 0; i < numObjects; i++) {
      colors[i] = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
  }

  public void paint(Graphics g) {
    int width = getSize().width;
    int height = getSize().height;

    for (int i = 0; i < numObjects; i++) {
      // Draw object
      g.setColor(colors[i]);
      int objSize = Math.min(width, height) / numObjects;
      int objX = i * objSize;
      int objY = height / 2 - objSize / 2;
      g.fillRect(objX, objY, objSize, objSize);
    }
  }
}

