import java.io.*;
import java.util.Scanner;

public class DataStreamExample {
    public static void main(String[] args) {
        String filePath = "E:\a.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Roll no");
        int userInt = scanner.nextInt();

        System.out.print("Enter a Marks: ");
        double userDouble = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Enter a Name");
        String userString = scanner.nextLine();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(userInt);
            dos.writeDouble(userDouble);
            dos.writeUTF(userString);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String stringValue = dis.readUTF();

            System.out.println("Retrieved data:");
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("String: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
