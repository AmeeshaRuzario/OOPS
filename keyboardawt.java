import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class DEMO extends Frame implements KeyListener {
    Label l;
    TextArea a;
    DEMO() {
        l = new Label();
        a = new TextArea();
        l.setBounds(20, 80, 100, 100);
        a.setBounds(20, 100, 400, 400);
        a.addKeyListener(this);
        add(l);
        add(a);
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
    }
        public void  keyPressed(KeyEvent e)
        {
            l.setText("key is pressed");
        }
        public void keyTyped(KeyEvent e)
        {
            l.setText("key is typed");

        }
        public void keyReleased (KeyEvent e)
        {
            l.setText("key is released");
        }



    public static void main(String[] args) {
        new DEMO();
    }
}
