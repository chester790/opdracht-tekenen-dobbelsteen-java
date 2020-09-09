import java.awt.*;
import java.applet.*;

public class dobbelsteenjava extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(100,20,100,100,10,10);
        g.setColor(Color.black);
        g.fillOval(110,30,30,30);
        g.drawOval(110,30,30,30);
        g.fillOval(160,30,30,30);
        g.drawOval(160,30,30,30);
        g.fillOval(110,80,30,30);
        g.drawOval(110,80,30,30);
        g.fillOval(160,80,30,30);
        g.drawOval(160,80,30,30);
    }
}
