import java.io.*;
import java.util.*;

class filehandling {
    public static void main(String args[]) {
        File f = new File("D:/23UAI304/a.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("Alreadsy exist");
            }

            FileWriter Writer = new FileWriter("a.txt");
            Writer.write("Writing in file");
            Writer.close();
            System.out.println("Successfully written.");

            Scanner readfile = new Scanner(f);
            while (readfile.hasNextLine()) {
                String data = readfile.nextLine();
                System.out.println("Contents in file: " + data);

            }
            readfile.close();

            if(f.delete()){
                System.out.println("File deleted.....");
            }

        } catch (IOException e) {
            System.out.println("An error has occurred.");
        }
    }
}