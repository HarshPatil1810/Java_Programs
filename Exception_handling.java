import java.util.*;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int[] a = new int[5];
        System.out.println("Enter Numbers..");
        for(int i=0;i<5;i++){
          a[i]= sc.nextInt();
        }




        try{
         System.out.println("Enter divisor..");
         int divisor=sc.nextInt();

        for(int j=0;j<5;j++){
            a[j]=a[j]%divisor;
        }
        System.out.println("Reminder..");
        for(int j=0;j<5;j++){
           System.out.println(a[j]);
        }
        }


        catch(Exception e){
            System.out.println("cant devide by 0...");
        }
        sc.close();
    }
}