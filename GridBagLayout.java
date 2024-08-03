import java.awt.*;
import javax.swing.*;
public class gridbag 
{
gridbag()
{
JButton b1=new JButton("b1");
JButton b2=new JButton("b1");
JButton b3=new JButton("b1");
JButton b4=new JButton("b1");
JButton b5=new JButton("b1");
Frame f=new Frame();
f.setSize(300,300);
f.setVisible(true);
f.setLayout(new GridBagLayout());
GridBagConstraints gs=new GridBagConstraints();
gs.fill(GridBagConstraints .HORIZONTAL);
gs.gridX=0;
gs.gridY=0;
f.add(b1,gs);

gs.gridX=1;
gs.gridY=0;
f.add(b2,gs);

}
public static void main(String args[])
{
gridbag g=new gridbag();
}
}


