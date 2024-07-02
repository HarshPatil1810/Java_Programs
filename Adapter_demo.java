import java.awt.*;
import java.awt.event.*;
class Adapter_demo extends MouseMotionAdapter
{

Label l;
Label l2;
Adapter_demo(){
Frame f=new Frame();
l=new Label();
l.setBounds(20,20,120,80);
f.add(l);
f.setSize(300,300);
f.setVisible(true);
l2=new Label("Take mouse here");
l2.setBounds(80,80,120,80);
l2.addMouseMotionListener(this);
}
public void mouseDragged(MouseEvent e)
{
int x,y;
x=e.getX();
y=e.getY();
l.setText("mouse dragged position  "+x +" "+y);
}
public static void main(String args[])
{
Adapter_demo ad=new Adapter_demo();
}
}


