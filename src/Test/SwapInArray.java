package Test;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {12, 10};
        for (int i = 0; i < arr.length; i++)
            System.out.println("element present  before at index" + i + "is " + arr[i]);

            //Using 3rd variable
            int temp = 0;
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println("=================");

            for (int i = 0; i < arr.length; i++)
                System.out.println("element present after at index" + i + "is " + arr[i]);
    }
    }
