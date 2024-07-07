import java.awt.*;
import javax.swing.*;
 class comboscrolll
{
public static void main(String args[])
{
String s[]={"m","k","g"};
JComboBox jc=new JComboBox(s);
jc.setBounds(50,50,90,20);
JScrollPane sc=new JScrollPane(jc,Scrollbar.HORIZONTAL_ALWAYS,Scrollbar.VERTICAL_ALWAYS);
Frame f=new Frame();
f.setSize(300,300);
f.setVisible(true);
f.add(sc);
}
}