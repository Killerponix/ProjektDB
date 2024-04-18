import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
      MyFrame App = new MyFrame(1);
      Panel panel1,panel2,panel3;
      Button but1, but2, but3, but4, but5, but6;
      panel1 =new Panel(1);
        but1 = new Button(1);
        App.setupFrame();
        //createGUI(App.getFrame());
        panel1.setupPanel(0,0,800,600);
        but1.setupbutton(0,0,200,80,"Dies ist ein Test");
        panel1.addButton(but1.getBut());
        App.addPanel(panel1.getPanel());


    }

    static void createGUI(JFrame frame) {
         frame = new JFrame("MYSQL Database Manager");
        frame.setName("MYSQL Database Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250, 250, 1280, 720);
//      frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}