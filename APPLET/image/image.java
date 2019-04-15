import java.awt.*;
import java.applet.*;

public class image extends Applet {

    Image picture;

    public void init() {
        picture = getImage(getDocumentBase(), "code.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(picture, 30, 30, this);
    }

}
/*
 * abstract <applet code="image.class" width="320" height="120"> If your browser
 * was Java-enabled, a "Hello, World" message would appear here. </applet>
 */