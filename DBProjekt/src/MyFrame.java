import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame{
   private JFrame frame;
   private int id;
   private Button but;

    public MyFrame(int id) {
        this.id=id;
        this.frame = new JFrame();
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
    }
    public void setupFrame(){
        setName("MYSQL Database Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250, 250, 1280, 720);
//      frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public void setName(String name){
        this.frame.setTitle(name);
    }
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Button getBut() {
        return but;
    }

    /**Diese Funktion ist eigentlich Nutzlos, da kein Button direkt dem Frame hinzugefügt wird
     *
     * @param but
     */
    public void addButton(Button but){
        this.frame.add(but.getBut());
    }
    public void addPanel(JPanel panel){
        this.frame.add(panel);
    //    System.out.println(this.frame);
     //   System.out.println("add Panel to Frame"+panel);
    }
}
