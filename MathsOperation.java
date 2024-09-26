import java.util.*;

public class MathsOperation {
    public static void main(String atrgs[]){
        Scanner scanner=new Scanner((System.in));
        int choise;
        do{
            System.out.println("Select Choise");
            System.out.println("1.Arithmetic");
            System.out.println("2.Stastical");
            System.out.println("3.Trignometric");
            System.out.println("4. Exit");
            System.out.println("Enter Choise");
            choise=scanner.nextInt();

            switch(choise){
                case 1:
                    arithmetic(scanner);
                    break;
                case 2:
                    stat(scanner);
                    break;
                case 3:
                    trigno(scanner);
                    break;
                case 4:
                System.exit(0); 
                break;

            }
        }while(choise!=4);

    }
       
    
    private static void arithmetic(Scanner scanner){
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Sum: "+num1+num2);
        //System.out.println("Diffrenece: "+ num1-num2);
        System.out.println("Product: "+num1*num2);
        System.out.println("Div: "+num1/num2);

    }
    private static void stat(Scanner scanner){
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double avg= sum / numbers.length;
    
        System.out.println("Avg. of set is "+avg);
    }

    private static void trigno(Scanner scanner){
        System.out.print("Enter Angle: ");
        double angle  = scanner.nextDouble();
        double radians = Math.toRadians(angle); 

        System.out.println("Sine value" + Math.sin(radians));
        System.out.println("cos value" +  Math.cos(radians));
        System.out.println("tan value" +  Math.tan(radians));


    }
}

