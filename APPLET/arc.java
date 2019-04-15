import java.applet.*;
import java.awt.*;

public class arc extends Applet {
    public void paint(Graphics g) {
        g.drawArc(50, 50, 20, 50, 30, 60);
        g.fillArc(270, 150, 30, 30, 0, 180);

    }
}

/*
 * abstract <applet code="arc.class" width="320" height="120"> If your browser
 * was Java-enabled, a "Hello, World" message would appear here. </applet>
 */