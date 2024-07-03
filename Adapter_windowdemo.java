import java.awt.*;
import java.awt.event.*;
class Adapter_windowdemo extends WindowAdapter

{
Frame f;
Adapter_windowdemo(){
f=new Frame();
f.setSize(300,300);
f.setVisible(true);
}
public void WindowClosing(WindowEvent e)
{
f.dispose();
}
public static void main(String args[])
{
Adapter_windowdemo ad=new Adapter_windowdemo();
}
}


