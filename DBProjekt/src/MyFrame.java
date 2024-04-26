import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**Klasse Myframe erstellen , damit ein Frame erstellt wird,
 * diesem wird Panels hinzugefügt, diesen müssen die einzelen Elemente hinzugefügt werden
 *
 */
public class MyFrame{
//   private JFrame frame;
//   private int id;
//   private Button but;


    /*
    public MyFrame(int id) {
        this.id=id;
        this.frame = new JFrame();
        run();
           Border border = BorderFactory.createLineBorder(Color.green,3);
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

        this.setVisible(true);
    }

     */


    public JFrame setupFrame(JFrame frame){
        frame.setTitle("MYSQL Database Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250, 250, 1280, 720);
//      frame.getContentPane().add(panel);
        frame.setVisible(true);
        return frame;
    }

//    public void setName(String name){
//        this.frame.setTitle(name);
//    }
//    public JFrame getFrame() {
//        return frame;
//    }
//
//    public void setFrame(JFrame frame) {
//        this.frame = frame;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Button getBut() {
//        return but;
//    }


//    public void addButton(Button but){
//       // this.frame.add(but.getBut());
//        but.getBut().addActionListener(this::actionPerformed);
//    }

    public JFrame addPanel(Panel panel, JFrame frame){
        frame.add(panel.getPanel());
    //    System.out.println(this.frame);
     //   System.out.println("add Panel to Frame"+panel);
    return frame;
    }
//    public void addComponent(JTextField jTf){
//        jTf.addActionListener(this::actionPerformed);
//    }




//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("Test");
//
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//        System.out.println("Test");
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        System.out.println("Test");
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        System.out.println("Test");
//    }
//
//    @Override
//    public void run() {
//       new Thread(new Runnable() {
//           @Override
//           public void run() {
//               while (true){
//
//               }
//           }
//       }).start();
//    }
}
