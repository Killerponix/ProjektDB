import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    private int id;
    private JButton but;

    /**Erzeugung eines Buttons
     *
     * @param id ID für erkennung des Buttons
     */
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

    /**Listener hinzufügen für einzelne Buttons
     * Durch die ID wird automatisch erkannt welcher BUtton gedrückt wird
     */
    public void addlistener(){
        ActionListener listener = e -> {
            boolean ausg= false;
            while (!ausg){
                switch (id) {
                    case 1:
                        ausg=!ausg;
                        System.out.println("1");
                        break;
                    case 2:
                        ausg=!ausg;
                        System.out.println("2");
                        break;
                    case 3:
                        ausg=!ausg;
                        System.out.println("3");
                        break;
                    case 6:
                        ausg=!ausg;
                        System.out.println("6");
                        break;
                }
            }

        };
        this.but.addActionListener(listener);
    }

    /**Button default setup
     *
     * @param x Pos X
     * @param y Pos Y
     * @param w Width
     * @param h Height
     * @param text Text
     */
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
}

