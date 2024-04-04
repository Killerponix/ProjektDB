import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame implements ActionListener {

    JButton but1, but2, but3;
    JFrame frame;
    JPanel panel;
    ActionListener listener1;

    public MyFrame() {
     /*   Border border = BorderFactory.createLineBorder(Color.green,3);
        JButton button = new JButton();
        button.setText("Dies ist ein BUttion");
        button.setFocusPainted(false);
        button.addActionListener(e -> System.out.println("Test"));
        button.setBackground(Color.blue);
        button.setBorder(border);
        button.setVisible(true);
        JLabel label = new JLabel();
        label.setText("Test 24");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setBorder(border);
        label.setBounds(0,0,120,120);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.getContentPane().setBackground(Color.darkGray);
        this.setTitle("Meins");
        //this.add(label);
        this.add(button);
        this.setLayout(null);

        this.setVisible(true);*/
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("MYSQL Database Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250, 250, 600, 400);
        but1 = new JButton("Button1");
        but1.setText("Test");
        //  but1.setMnemonic('A');   //Hotkey für Tastenfunktion
        but1.setBorderPainted(false);
        but1.setBackground(Color.red);
        but1.setBorder(null);
        but1.setFocusable(false);
        but1.setMargin(new Insets(100, 100, 100, 100));
        but1.setSize(150, 150);
        but1.addActionListener(this);
        panel = new JPanel();
        panel.add(but1);
        frame.add(panel);


        //  panel.setVisible(true);
        frame.setVisible(true);


    }

    private JButton setupbutton(JButton but) {
        but.setBorderPainted(false);
        but.setBackground(Color.red);
        but.setBorder(null);
        but.setFocusable(false);
        but.setMargin(new Insets(100, 100, 100, 100));
        but.addActionListener(this);
        return but;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action!");
    }

}
