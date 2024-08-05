import java.util.*;
class LL
{
Node head;
class Node
{
String data;
Node next;
Node(String data)
{
this.data=data;
this.next=null;
}
}
public void addFirst(String data)
{
Node newNode=new Node(data);
if(head==null)
{
head=newNode;
return;
}
newNode.next=head;
head=newNode;
}

public void addLast(String data)
{
Node newNode=new Node(data);
if(head==null)
{
head=newNode;
return;
}
Node curr=head;
while(curr!=null)
{
curr=curr.next;
}
curr.next=newNode;
}


public void printList()
{
Node curr=head;
while(curr!=null)
{
System.out.print(curr.data+"->");
curr=curr.next;
}
System.out.print("Null");
}
}

public static void main(String args[])
{
LL list=new LL();
list.addFirst("This");
list.addFirst("is");
list.printList();
}
}


