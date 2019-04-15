import java.awt.*;
import java.awt.event.*;

class Emoji extends Frame implements MouseMotionListener {

    Label l1;

    Emoji() {
        l1 = new Label();
        add(l1);
        l1.setBounds(20, 60, 100, 20);
        setBackground(Color.WHITE);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void mouseMoved(MouseEvent e) {
        l1.setText("(" + Integer.toString(e.getX()) + "," + Integer.toString(e.getY()) + ")");
    }

    public void mouseDragged(MouseEvent e) {
        l1.setText("(" + Integer.toString(e.getX()) + "," + Integer.toString(e.getY()) + ")");
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(120, 120, 150, 150);
        g.drawOval(140, 140, 40, 60);
        g.drawOval(210, 140, 40, 60);
        g.drawLine(195, 180, 195, 220);
        g.drawArc(155, 200, 80, 50, 0, -180);
    }

    public static void main(String args[]) {
        new Emoji();
    }
}