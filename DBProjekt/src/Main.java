/*Created by Killerponix (Simon Garb) and Simon Schmidt
 *
 * This Program is build as project for the module Datenbanken und Datensicherheit hosted by Prof. Peter Gerwinski
 * This Program is a Database Manger which is connected to a MSQL Database Server and can change, display, add and delte elemts from it
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
      MySQL DB = new MySQL();
        DB.connect();
//      DB.update();
      DB.disconnect();


        MyFrame App = new MyFrame(1);

      Panel panel1,panel2,panel3;
      Button but1, but2, but3, but4, but5, but6;
      ActionListener listener = null;
      panel1 =new Panel(1);
        but1 = new Button(1);
        but2 = new Button(2);
        App.setupFrame();
//        createGUI(App.getFrame());
        panel1.setupPanel(0,0,800,600);
        but1.setupbutton(0,0,200,80,"Dies ist ein Test");
        but2.setupbutton(200,80,200,80,"Dies ist ein Test");
        panel1.addObject(but1.getBut());
        panel1.addObject(but2.getBut());
        App.addPanel(panel1.getPanel());


    }



    /**Funktion wird eigentlich nicht mehr genutzt, kann aber genutzt werdeb um die Main zu verkürzen
     * Status der benutzung kann sich jederzeit ändern
     * @param frame
     */
    static void createGUI(JFrame frame) {
         frame = new JFrame("MYSQL Database Manager");
        frame.setName("MYSQL Database Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250, 250, 1280, 720);
//      frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

