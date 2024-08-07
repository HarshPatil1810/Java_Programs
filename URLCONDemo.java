import java.net.*; 
import java.util.*; 
public class URLCONDemo{  
public static void main(String[] args){  
Scanner sc=new Scanner(System.in);
System.out.println("Enter url");
String a=sc.nextLine();
try{  
URL url=new URL(a);  
 URLConnection u=url.openConnection();
System.out.println("Type: "+u.getContentType());  
System.out.println("length: "+u.getContentLength());  
System.out.println("daye: "+u.getDate());  
System.out.println("url: "+u.getURL());  
System.out.println("url: "+u.getContentEncoding());
  
}catch(Exception e){System.out.println(e);}  
}  
}  