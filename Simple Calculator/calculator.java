import java.awt.*;
import java.awt.event.*;

class calculator extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, be, bac, bplus, bminus, bmul, bdiv;
    TextField screen;
    String[] a = new String[3];
    boolean flag = false;
    int i = 0;

    calculator() {

        // Layouts
        GridLayout g1 = new GridLayout(4, 4, 2, 2);
        GridLayout g2 = new GridLayout(1, 1, 5, 5);

        // Panels
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        p1.setLayout(g1);
        p2.setLayout(g2);

        // Creating screen
        screen = new TextField();

        // Creating number buttons
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        be = new Button("=");
        bac = new Button("AC");
        bplus = new Button("+");
        bmul = new Button("*");
        bminus = new Button("-");
        bdiv = new Button("%");

        // adding components
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(bplus);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(bminus);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(bmul);
        p1.add(bac);
        p1.add(b0);
        p1.add(be);
        p1.add(bdiv);
        p2.add(screen);
        add(p2);
        add(p1);

        // Set Bounds to panel
        p2.setBounds(0, 0, 300, 30);
        p1.setBounds(0, 30, 300, 270);
        screen.setBounds(0, 0, 300, 30);

        // Adding action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bac.addActionListener(this);
        be.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);

        // To close awt frame window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // setting frame properties
        setLayout(new GridLayout(2, 1));
        setTitle("Akshat's Calculator");
        setSize(300, 300);
        setVisible(true);
        setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() != be && e.getSource() != bac) {
            a[i] = e.getActionCommand();
            if (flag == true) {
                screen.setText("");
                flag = false;
            }
            screen.setText(screen.getText() + e.getActionCommand());
            i++;
            if (i == 3) {
                flag = true;
                i = 0;
            }
        }

        if (e.getSource() == be) {
            if (a[1] == "+") {
                screen.setText(Integer.toString(Integer.parseInt(a[0]) + Integer.parseInt(a[2])));
            }
            if (a[1] == "-") {
                screen.setText(Integer.toString(Integer.parseInt(a[0]) - Integer.parseInt(a[2])));
            }
            if (a[1] == "*") {
                screen.setText(Integer.toString(Integer.parseInt(a[0]) * Integer.parseInt(a[2])));
            }
            if (a[1] == "%") {
                screen.setText(Integer.toString(Integer.parseInt(a[0]) % Integer.parseInt(a[2])));
            }

        }

        if (e.getSource() == bac) {
            screen.setText("");
        }
    }

    public static void main(String args[]) {
        new calculator();
    }
}