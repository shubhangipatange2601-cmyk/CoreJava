package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            // some code that may throw an exception
            FileInputStream file = new FileInputStream("myFile.txt");
        } catch (IOException e){
            //handle IOException
            System.out.println("An I/O Exception occurred: " + e.getMessage());
        }catch (NullPointerException e ){
            //Handle NullPointerException
            System.out.println("A NullPointerException occurred " + e.getMessage());
        }catch (Exception e){
            //handle any other exception
            System.out.println("An unexpected Exception occurred: " + e.getMessage());
        }
    }
}
