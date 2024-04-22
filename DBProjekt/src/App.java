import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.lang.Thread.*;

public class App implements Runnable{
    public App() {
        run();
    }

    @Override
    public void run() {
        MySQL DB = new MySQL();
//        DB.connect();
//      DB.update();
//      DB.disconnect();
        MyFrame App = new MyFrame(1);

        Panel panel1,panel2,panel3;
        Button but1, but2, but3, but4, but5, but6;
        ActionListener listener = null;
        panel1 =new Panel(1);
        but1 = new Button(1);
        but2 = new Button(2);
        App.setupFrame();

        //        createGUI(App.getFrame());
//        panel1.setupPanel(0,0,800,600);
//        but1.setupbutton(0,0,200,80,"Dies ist ein Test");
//        but2.setupbutton(200,80,200,80,"Dies ist ein Test");
//        panel1.addObject(but1.getBut());
//        panel1.addObject(but2.getBut());
//        App.addPanel(panel1);
        System.out.println(DB.getUsername() + DB.getPassword());
        createLogin(App);
        createSidePanel(App);

    }
    static void createLogin(MyFrame frame){
        Panel loginPanel = new Panel(3);
        Button Bconnect = new Button(6);
        Bconnect.setupbutton(1280/2-75,540,150,75,"Connect");
//        Bconnect.addlistener();
//        frame.addButton(Bconnect);

        JTextField JTFUser = new JTextField();
        JLabel JLUser = new JLabel("Username");
        JLUser.setBounds(20, 40, 120, 20);
        JTFUser.setBounds(20, 60, 120, 26);
        JTFUser.setLocation(20,60);
        JLUser.setLocation(20,40);
        JTFUser.setHorizontalAlignment(JTextField.CENTER);

        JTextField JTFPW = new JTextField();
        JLabel JLPW = new JLabel("Password");
        JLPW.setBounds(120, 40, 120, 20);
        JTFPW.setBounds(120, 60, 120, 26);
        JTFPW.setLocation(20,160);
        JLPW.setLocation(20,140);
        JTFPW.setHorizontalAlignment(JTextField.CENTER);

        JTextField JTFAdr = new JTextField();
        JLabel JLAdr = new JLabel("Adresse");
        JLAdr.setBounds(20, 40, 120, 20);
        JTFAdr.setBounds(20, 60, 120, 26);
        JTFAdr.setLocation(20,260);
        JLAdr.setLocation(20,240);
        JTFAdr.setHorizontalAlignment(JTextField.CENTER);

        loginPanel.getPanel().add(JLAdr);
        loginPanel.getPanel().add(JLPW);
        loginPanel.getPanel().add(JLUser);
        loginPanel.getPanel().add(JTFUser);
        loginPanel.getPanel().add(JTFPW);
        loginPanel.getPanel().add(JTFAdr);
        loginPanel.getPanel().setVisible(true);

//        loginPanel.addObject(JLAdr);
//        loginPanel.addObject(JLPW);
//        loginPanel.addObject(JLUser);
//        loginPanel.addObject(JTFUser);
//        loginPanel.addObject(JTFPW);
//        loginPanel.addObject(JTFAdr);
        Bconnect.ListenToText(JTFUser);
        Bconnect.ListenToText(JTFPW);
        Bconnect.ListenToText(JTFAdr);
        loginPanel.addButton(Bconnect.getBut());
        loginPanel.setupPanel(0,0,922,680);
        loginPanel.getPanel().setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Connection Control"));
        loginPanel.getPanel().updateUI();
        frame.addPanel(loginPanel);
        while (!Bconnect.isPressed()){
            try {
                System.out.println("NoT Pressed");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        loginPanel.changeVisible();


    }



    /**Funktion wird eigentlich nicht mehr genutzt, kann aber genutzt werdeb um die Main zu verkürzen
     * Status der benutzung kann sich jederzeit ändern
     * **--Edit 20.04.24-- Funkton wird umfunktioniert
     * Deswegen wieder in Verwendung
     *
     * @param frame
     */
    static void createGUI(MyFrame frame) {
//         frame = new JFrame("MYSQL Database Manager");
//        frame.setName("MYSQL Database Manager");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(250, 250, 1280, 720);
//      frame.getContentPane().add(panel);
//        frame.setVisible(true);


    }
    static Object[] createSidePanel(MyFrame frame){
        Panel jpConnect = new Panel(2);
        Button but = new Button(3);
        but.setupbutton(100,100,80,40,"BUtton3");
//        but.addlistener();
//        frame.addButton(but);
        jpConnect.addButton(but.getBut());

        jpConnect.getPanel().setLayout(null);
        jpConnect.getPanel().setBounds(800, 0, 460, 680);
        jpConnect.getPanel().setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Connection Control"));


        JTextField jtfIP = new JTextField();
        JLabel jlIP = new JLabel("IPAddress");
        jlIP.setBounds(20, 40, 120, 20);
        jtfIP.setBounds(20, 60, 120, 26);
        jtfIP.setHorizontalAlignment(JTextField.CENTER);
        jpConnect.getPanel().add(jlIP);
        jpConnect.getPanel().add(jtfIP);
        jpConnect.getPanel().setVisible(true);
        frame.addPanel(jpConnect);
        Object [] ret = new Object[4];
        ret[0]=but;
        ret[1]= jpConnect;
        ret[2] = jlIP;
        ret[3] = jtfIP;
        return ret;
    }
    //IDK ob ich es so mache, oder ob ich die Strukturn ochmal überarbeite, damit der Action listener auch funktioniert, bzw. damit man auf die Objekte die dort erstellt weden noch zugreifen kann, muss maN für die dann noch eine referenz haben
    // Gemeint ist die Rückgabe mit Object[]
  /*  @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Test");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Test");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Test");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Test");
    }

    @Override
    }*/
    public void setConnected(){
        System.out.println("TRUE");

    }

}//App class
