import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IP_Finder extends Frame implements ActionListener {
    JTextField tf;
    JLabel l;
    JButton b;

    IP_Finder() {
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        b = new JButton("Find IP");
        b.setBounds(50, 150, 95, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new IP_Finder();
    }
}
