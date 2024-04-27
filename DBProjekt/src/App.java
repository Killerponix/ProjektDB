import javax.security.auth.callback.Callback;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.concurrent.*;

import static java.lang.Thread.*;

public class App extends MyFrame implements Runnable, ActionListener, ItemListener {
    public App() {
        super();
        run();
    }

    JButton connect;
    JTextField JTFUser,JTFAdr;
    JPasswordField JTFPW;
    JComboBox JCBTable;
    boolean connected=false;
    MySQL DB = new MySQL();


    @Override
    public void run() {

//        DB.connect();
//      DB.update();
//      DB.disconnect();
       MyFrame App = new MyFrame();
       Button but = new Button();
        JFrame frame = new JFrame();
        frame = App.setupFrame(frame);
        JPanel loginpanel = new JPanel();
        loginpanel =loginpanel(loginpanel);
        frame.add(loginpanel);
        JPanel Jpmain= new JPanel();
        while (connected == false){
            try {
                sleep(1000);
                System.out.println("Login STILL");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        loginpanel.setVisible(false);
        Jpmain = MainPanel(Jpmain);
        frame.add(Jpmain);

        //        createGUI(App.getFrame());
//        panel1.setupPanel(0,0,800,600);
//        but1.setupbutton(0,0,200,80,"Dies ist ein Test");
//        but2.setupbutton(200,80,200,80,"Dies ist ein Test");
//        panel1.addObject(but1.getBut());
//        panel1.addObject(but2.getBut());
//        App.addPanel(panel1);
//        createLogin(App);
//        createSidePanel(App);
//        createMainPanel(App);

    }//RUN


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();
        System.out.println("Irgendetwas");
        if (source==connect){
            String us = JTFUser.getText();
            String pw= Arrays.toString(JTFPW.getPassword());
            String adr = JTFAdr.getText();
            System.out.println(us+" "+pw+" "+adr);
//            DB.connect();
            if (DB.isConnected()){
                connected=true;
            }else {
                System.out.println("Not Connected, aber egal, WEITER");
                connected=true;
            }
        }else if (false){

        }

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        System.out.println("You are CHANGED");
    }

    public JButton setupbutton(int x, int y, int w, int h, String text, JButton but) {
        but.setBorderPainted(true);
        but.setBackground(Color.red);
        but.setForeground(Color.cyan);
        but.setBounds(x, y, w, h);
        but.setFocusable(true);
        but.addActionListener(this::actionPerformed);
        // but.setMargin(new Insets(100, 100, 100, 100));
        //    this.but.addActionListener(this);
        but.setSize(w,h);
        but.setLocation(x, y);
        but.setMinimumSize(new Dimension(200,80));
        but.setText(text);
        //addlistener();
        but.setVisible(true);
        return but;
    }

    public JPanel loginpanel(JPanel loginPanel){
        loginPanel.setBounds(0,0,922,680);
        loginPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Connection Control"));
        connect = new JButton();
        connect = setupbutton(1280/2-75,540,150,75,"Connect",connect);

        JTFUser = new JTextField();
        JLabel JLUser = new JLabel("Username");
        JLUser.setBounds(20, 40, 120, 20);
        JTFUser.setBounds(20, 60, 120, 26);
        JTFUser.setLocation(20,60);
        JLUser.setLocation(20,40);
        JTFUser.setHorizontalAlignment(JTextField.CENTER);

        JTFPW = new JPasswordField();
        JLabel JLPW = new JLabel("Password");
        JLPW.setBounds(120, 40, 120, 20);
        JLPW.setLocation(120,40);
        JTFPW.setBounds(120, 60, 120, 26);
        JTFPW.setLocation(20,160);
        JLPW.setLocation(20,140);
        JTFPW.setHorizontalAlignment(JTextField.CENTER);

        JTFAdr = new JTextField();
        JLabel JLAdr = new JLabel("Adresse");
        JLAdr.setBounds(20, 40, 120, 20);
        JTFAdr.setBounds(20, 60, 120, 26);
        JTFAdr.setLocation(20,260);
        JLAdr.setLocation(20,240);
        JTFAdr.setHorizontalAlignment(JTextField.CENTER);
//        JTFPW.addActionListener(this::actionPerformed);
//        JTFUser.addActionListener(this::actionPerformed);
//        JTFAdr.addActionListener(this::actionPerformed);

        loginPanel.add(JLAdr);
        loginPanel.add(JLPW);
        loginPanel.add(JLUser);
        loginPanel.add(JTFUser);
        loginPanel.add(JTFPW);
        loginPanel.add(JTFAdr);
        loginPanel.add(connect);
        loginPanel.setVisible(true);


        loginPanel.updateUI();
        return loginPanel;
    }

    public JPanel MainPanel(JPanel panel){
        panel.setBounds(0,0,1240,680);
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Main"));
        panel.setBounds(0,0,1280,720);
        panel.setVisible(true);
        JCBTable = new JComboBox();
        String s= "Ein String";
        Object x = s.toString();
        String s1= "Zwei String";
        Object y = s1.toString();
        JCBTable.addItem(x);
        JCBTable.addItem(y);
        JCBTable.setBounds(50,50,600,100);
        JCBTable.setVisible(true);
        JCBTable.addItemListener(this::itemStateChanged);
        panel.add(JCBTable);
        return panel;
    }




//<<<<<<<<<<<<<<<<<----------------------------------------- Alter Code Bis commit MainPanel ------------------------------>>>>>>>>>>>>>>>>>
/*
    void createLogin(MyFrame frame){
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

static void createGUI(MyFrame frame) {
//         frame = new JFrame("MYSQL Database Manager");
//        frame.setName("MYSQL Database Manager");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(250, 250, 1280, 720);
//      frame.getContentPane().add(panel);
//        frame.setVisible(true);


}

    void createMainPanel(MyFrame frame){
        Panel jpMain = new Panel(2);
        jpMain.setupPanel(0,0,900,680);
        jpMain.getPanel().setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red), "Main"));
        frame.addPanel(jpMain);
    }

    Object[] createSidePanel(MyFrame frame){
        Panel jpConnect = new Panel(3);
        Button but = new Button(3);
        but.setupbutton(100,100,80,40,"BUtton3");
//        but.addlistener();
//        frame.addButton(but);
        jpConnect.addButton(but.getBut());
        jpConnect.setupPanel(1000,0,280,680);
        jpConnect.getPanel().setLayout(null);
        jpConnect.getPanel().setBounds(1000, 0, 280, 680);
        jpConnect.getPanel().setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Control"));


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
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("Test");
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
//    }
//    public void setConnected(){
//        System.out.println("TRUE");
//
//    }
 */

}//App class
