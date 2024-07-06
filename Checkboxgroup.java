import java.awt.*;
class EX2
{
public static void main(String srgs[])
{
Frame f=new Frame();
f.setSize(300,300);
f.setVisible(true);
Label l=new Label("Entefr name");
Checkbox c=new Checkbox("C");
Checkbox c1=new Checkbox("C++");
//CheckboxGroup cg=new CheckboxGroup("java");
f.add(c);
f.add(c1);
//f.add(cg);
}
}
