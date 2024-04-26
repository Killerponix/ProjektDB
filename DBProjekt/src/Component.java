import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Component{
    int id;
    JComponent comp;
    public Component() {
    }
    Button createButton(int id){
        Button but = new Button();
        comp =but.getBut();
        return but;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

