import javax.swing.*;

public class Panel extends Component {
    private int id;
    private JPanel panel;

    public Panel(int id){
        super(id);
        this.id=id;
        this.panel= new JPanel();
    }

    public void setupPanel(int x,int y, int w, int h){
        this.panel.setBounds(x, y, w, h);
        this.panel.setVisible(true);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**Damit kann ein belibiges Object dem Panel Hinzugefügt werden
     *
     * @param component Die hinzufügende Komponente
     */
    public void addObject(JComponent component){
        this.panel.add(component);
    }
    public void addButton(JButton button){
        this.panel.add(button);
    //    System.out.println("add button"+button);
    }
    public void changeVisible(){
        this.panel.setVisible(!this.panel.isVisible());
    }

}
