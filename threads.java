import java.io.*;
import java.util.*;

class fthread extends Thread{
    public void run(){
    
        for (int i=0;i<=5;i++){
            System.out.println("First Class"+i);
             try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
class sthread extends Thread{
    public void run(){
    
        for (int i=0;i<=5;i++){
            System.out.println("Second Class"+i);
             try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

class threads{
    public static void main(String args[]){
       fthread f1=new fthread();
    sthread s1=new sthread();
    f1.start();
    s1.start();
    }
}