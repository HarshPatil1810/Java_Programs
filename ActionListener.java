import java.net.*; 
import java.util.*; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EX35 implements ActionListener
{
Label l;
Label l2;
Label l3;
JTextField t;
JTextField t2;
Button b;
EX35(){
l=new Label("Enter 1st no");
l.setBounds(20,75,80,30);
t=new JTextField();
t.setBounds(40,90,80,30);
l2=new Label("Enter 2nd no");
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
int a= Integer.parseInt(t.getText());
int b= Integer.parseInt(t2.getText());
int add=a+b;
l3.setText(String.valueOf(add));
}
public static void main(String args[]){
EX35 a=new EX35();
}
}
