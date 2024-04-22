import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Button extends Component{
    private int id;
    private JButton but;
    private static JComponent [] listto;
    private static int compI =0;
    private JTextField [] JTlogin =new JTextField[3];

    /**Erzeugung eines Buttons
     *
     * @param id ID für erkennung des Buttons
     */
    public Button(int id){
        super(id);
        this.id=id;
        this.but = new JButton();
    }

    public int getId() {
        return id;
    }
    public void ListenToText(JComponent jComponent){
        JTlogin[compI] = (JTextField) jComponent;
        compI++;
//        System.out.println(jComponent);
//
//                listto[compI].add(jComponent);
//        System.out.println(listto[compI]);
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
                        MySQL sql = new MySQL();
                        sql.setUsername(JTlogin[0].getText());
                        sql.setPassword(JTlogin[1].getText());
//                        sql.setHost(JTlogin[2].getText());
                        System.out.println(sql.getUsername());
                        System.out.println(sql.getPassword());
                        System.out.println("Button 6");
//                        while(!sql.isConnected()){
//                            sql.connect();
//                        }
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

