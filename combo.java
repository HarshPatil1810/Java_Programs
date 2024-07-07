import java.awt.*;
import javax.swing.*;
public class combo
{
public static void main(String args[])
{
String s[]={"m","k","g"};
JComboBox jc=new JComboBox(s);
jc.setBounds(50,50,90,20);
Frame f=new Frame();
f.setSize(300,300);
f.setVisible(true);
f.add(jc);
}
}