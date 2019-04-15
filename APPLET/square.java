import java.applet.*;
import java.awt.*;

public class square extends Applet {
    public void paint(Graphics g) {
        g.drawRect(10, 10, 100, 100);
        g.fillRect(10, 10, 100, 100);
    }
}

/*
 * abstract <applet code="square.class" width="320" height="120"> If your
 * browser was Java-enabled, a "Hello, World" message would appear here.
 * </applet>
 */