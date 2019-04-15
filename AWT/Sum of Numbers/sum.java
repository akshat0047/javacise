import java.awt.*;
import java.awt.event.*;

class sum extends Frame implements ActionListener {
    TextField tx1, tx2;
    Label l;
    Button b;

    sum() {
        tx1 = new TextField();
        tx2 = new TextField();
        b = new Button("Sum");
        l = new Label();
        tx1.setBounds(120, 60, 60, 20);
        tx2.setBounds(120, 100, 60, 20);
        b.setBounds(130, 130, 50, 20);
        l.setBounds(140, 180, 100, 20);

        add(tx1);
        add(tx2);
        add(b);
        add(l);

        setTitle("Sum Panel");
        setSize(300, 300);
        setVisible(true);
        setLayout(null);

        b.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(tx1.getText());
        int y = Integer.parseInt(tx2.getText());
        l.setText("Sum:" + Integer.toString(x + y));
    }

    public static void main(String args[]) {
        new sum();
    }
}
