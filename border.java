import java.awt.*;
public class border
{
public static void main(String args[])
{
Frame f=new Frame();
f.setLayout(new BorderLayout());
f.setSize(300,300);
f.setVisible(true);
Button b1=new Button("North");
Button b2=new Button("Button b12");
Button b3=new Button("Button b13");
Button b4=new Button("Button b15");
Button b5=new Button("Button b15");
//Button b6=new Button("Button b15");
f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);
//f.add(b6);
}
}
