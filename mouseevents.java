import java.awt.*;
import java.awt.event.*;

public class MOUSE extends Frame implements MouseListener, MouseMotionListener, MouseWheelListener {
    Label l;
    MOUSE()
    {
        l= new Label();
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        l.setBounds(0,0,500,100);
        add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    public void mouseClicked(MouseEvent e){
        l.setText("mouse clicked");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("mosue pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("mouse released");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("mouse exited");
    }
    public void mouseDragged(MouseEvent e)
    {
        l.setText("mouse is dragged from "+ e.getX() + "to "+e.getY());
    }
    public void mouseMoved(MouseEvent e)
    {
        l.setText("mouse is moved from "+ e.getX() + "to "+e.getY());
    }
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        l.setText("mouse wheel moved");
    }

    public static void main(String[] args) {
        new KEY();
    }
}
