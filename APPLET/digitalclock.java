import java.util.*;

import java.text.*;

import java.applet.*;

import java.awt.*;

public class digitalclock extends Applet implements Runnable {
    int h = 0, m = 0, s = 0;
    String time = "";
    Thread t1 = null;

    public void init() {
        setBackground(Color.BLACK);
    }

    public void start() {
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        try {
            while (true) {
                Calendar cl = Calendar.getInstance();
                h = cl.get(Calendar.HOUR_OF_DAY);
                if (h > 12) {
                    h -= 12;
                }
                m = cl.get(Calendar.MINUTE);
                s = cl.get(Calendar.SECOND);
                SimpleDateFormat sdt = new SimpleDateFormat("hh:mm:ss");
                Date dt = cl.getTime();
                time = sdt.format(dt);
                repaint();
                t1.sleep(1000);
            }
        } catch (Exception e) {

        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString(time, 160, 60);
    }
}

/*
 * abstract <applet code="digitalclock.class" width="320" height="120"> If your
 * browser was Java-enabled, a "Hello, World" message would appear here.
 * </applet>
 */