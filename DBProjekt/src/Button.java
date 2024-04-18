import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
    private int id;
    private JButton but;

    public Button(int id){
        this.id=id;
        this.but = new JButton();
    }

    public int getId() {
        return id;
    }

    public JButton getBut() {
        return but;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBut(JButton but) {
        this.but = but;
    }
    public void addlistener(){
        ActionListener listener = e -> {
            switch (id) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        };
        this.but.addActionListener(listener);
    }
    public void setupbutton(int x, int y,int w,int h, String text) {
        this.but.setBorderPainted(true);
        this.but.setBackground(Color.red);
        this.but.setForeground(Color.cyan);
        this.but.setBounds(x, y, w, h);
        this.but.setFocusable(true);
        // but.setMargin(new Insets(100, 100, 100, 100));
    //    this.but.addActionListener(this);
        this.but.setSize(w,h );
        this.but.setLocation(x, y);
        this.but.setMinimumSize(new Dimension(200,80));
        this.but.setText(text);
        addlistener();
        this.but.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Test");

    }
}

