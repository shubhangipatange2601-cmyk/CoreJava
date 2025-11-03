package ArrayBasicPrograms;

import java.sql.SQLOutput;

public class Question2 {
    public static void main(String[] args) {
        //Modifying elements of an array
        int[] arrayTemp = {20, 39, 40, 60};
        arrayTemp[3] = 56;
        System.out.println("Array after modification: " + java.util.Arrays.toString(arrayTemp));


        int[] arrayABCD = {34, 45, 26, 59, 90};
        arrayABCD[4] = 32;
        System.out.println("array after modification: " + java.util.Arrays.toString(arrayABCD));


    }
}