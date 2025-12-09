package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("example.txt");   //This may throw an IOException
            file.write("Hello,world!");
        } catch (IOException e) {
            //Handling the checked exception
            System.out.println("An error occurred while writing to the file");
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file ");
            }

        }
    }

}
