class A{
void show(){
System.out.println("hello");
}
}
class B extends A
{
void show()
{
System.out.println("hello welcome");
}
}
class example
{
public static void main(String args[])
{
A obj=new B();
obj.show();
}
}