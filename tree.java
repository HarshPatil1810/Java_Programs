import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
class tree
{
public static void main(String args[])
{
DefaultMutableTreeNode d=new DefaultMutableTreeNode("my pc");
DefaultMutableTreeNode d1=new DefaultMutableTreeNode("C drive");
DefaultMutableTreeNode d2=new DefaultMutableTreeNode("D drive");
DefaultMutableTreeNode d3=new DefaultMutableTreeNode("pro file");
DefaultMutableTreeNode d4=new DefaultMutableTreeNode("java");
d.add(d1);
d.add(d2);
d1.add(d3);
d2.add(d4);
JTree t=new JTree(d);

Frame f=new Frame();
f.setSize(300,300);
f.setVisible(true);
f.add(t);
}
}