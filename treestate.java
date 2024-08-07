import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
class treestate
{
public static void main(String args[])
{
DefaultMutableTreeNode d=new DefaultMutableTreeNode("India");
DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Karnataka");
DefaultMutableTreeNode d2=new DefaultMutableTreeNode("Maharashtra");
DefaultMutableTreeNode d3=new DefaultMutableTreeNode("Belgaum");
DefaultMutableTreeNode d4=new DefaultMutableTreeNode("Bidar");
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