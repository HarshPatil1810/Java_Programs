import java.time.LocalDate;
import java.time.Period;
class person{

     String name;
     LocalDate birthdate;
     double height;
     double weight;
     String address;
    
     person(String name, LocalDate birthdate, double height, double weight, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }


   int calculateAge(){
       LocalDate today = LocalDate.now();
        Period period = Period.between(birthdate, today);
        return period.getYears();
   } 
   
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Address: " + address);
      //  System.out.println("Age: " + calculateAge() + " years");
    }

}
class student extends person{

   String rollNo;
   double[] marks;

  
    student(String name, LocalDate birthdate, double height, double weight, String address, String rollNo, double[] marks) {
        super(name, birthdate, height, weight, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

   
    public double calculateAvg() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return marks.length > 0 ? total / marks.length : 0;
    }

     public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average Marks: " + calculateAvg());
    }
}

class Employee extends person{

int empId;
double salary;

 Employee(String name, LocalDate birthdate, double height, double weight, String address, int empId, double salary) {
        super(name, birthdate, height, weight, address);
        this.empId = empId;
        this.salary = salary;
}

double calculateTax(){
double rate=0.20;
return salary * rate;
}

void displayEmployeeDetails(){
   displayPersonDetails(); 
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Tax: Rs " + calculateTax());
}
}


public class Exp5 {
    public static void main(String[] args) {
        student student = new student(
            "Abc",18/10/2003,
            175.5,
            70.0,
            "1234 abc Street",
            "S12345",
            new double[]{85.5, 90.0, 78.0}
        );
        System.out.println("Student Details:");
        student.displayStudentDetails();

	System.out.println(); 
        
      
        Employee employee = new Employee(
            "Harsh",
        18/10/2003,
            165.0,
            60.0,
            "5678 abc street",
            90,
            75000.0
        );
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
    }
}