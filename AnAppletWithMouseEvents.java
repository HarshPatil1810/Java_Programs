import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithMouseEvents extends Applet implements MouseListener {
public void init()
{    
     TextArea t=new TextArea();
     add(t);
     t.addMouseListener(this);
}
public void paint(Graphics g)
{

    g.setColor(Color.green);
    
}
public void mouseClicked(MouseEvent e)
{
    /*String clickDesc;
    if (e.getClickCount() == 2)
        clickDesc = "double";
    else
        clickDesc = "single";*/

    System.out.println("Mouse was " + e.getClickCount() + "-clicked at location (" +
        e.getX() + ", " + e.getY() + ")");

}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
}

/*<applet code="AnAppletWithMouseEvents.class" height="300"
width="300">
</applet>
*/