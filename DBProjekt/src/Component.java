import javax.swing.*;

public class Component {
    int id;
    JComponent comp;
    public Component(int id) {
        this.id = id;
    }
    Button createButton(int id){
        Button but = new Button(id);
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

