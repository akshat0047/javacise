import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mouseevents extends JFrame implements MouseListener, MouseMotionListener {
    int x, y;
    JLabel l1;

    mouseevents() {
        l1 = new JLabel();
        add(l1);
        l1.setBounds(200, 250, 100, 30);
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(500, 500);
        setVisible(true);
        setLayout(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        l1.setText("(" + Integer.toString(x) + "," + Integer.toString(y) + ")");
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        l1.setText("(" + Integer.toString(x) + "," + Integer.toString(y) + ")");
    }

    public void paint(Graphics g) {
        g.drawString("mouse event occured at :" + "(" + Integer.toString(x) + "," + Integer.toString(x) + ")", 200,
                200);
    }

    public static void main(String args[]) {
        new mouseevents();
    }

}