package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            //Trying to open a file that does not exist
            File file = new File("mydata.txt");
            Scanner sc = new Scanner(file);

            //reading file content
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found! please check the file name or path ");
            //print detailed information
            e.printStackTrace();
        }
    }
}

