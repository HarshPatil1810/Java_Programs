import java.net.*; 
import java.util.*; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class authentication implements ActionListener
{
Label l;
Label l2;
Label l3;
JTextField t;
JTextField t2;
Button b;
authentication(){
l=new Label("Enter name");
l.setBounds(20,75,80,30);
t=new JTextField();
t.setBounds(40,90,80,30);
l2=new Label("Enter pass");
l2.setBounds(60,105,80,30);
t2=new JTextField();
t2.setBounds(80,110,80,30);

b=new Button("Submit");
b.setBounds(10,20,20,30);
b.addActionListener(this);
l3=new Label();
l3.setBounds(40,140,30,40);
JFrame f=new JFrame();
f.setVisible(true);
f.setSize(300,300);
f.add(l);
f.add(t);
f.add(l2);
f.add(t2);
f.add(b);
f.add(l3);
}
public void actionPerformed(ActionEvent e){
String a= t.getText();
String b=t2.getText();
l3.setText("name"+a+" "+b);
}
public static void main(String args[]){
authentication a=new authentication();
}
}
