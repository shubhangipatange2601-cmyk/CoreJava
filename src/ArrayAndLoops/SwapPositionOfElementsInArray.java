package ArrayAndLoops;

public class SwapPositionOfElementsInArray {
    public static void main(String[] args) {
        int[]arr = {101,202};
         for(int i = 0; i<arr.length; i++) {
             System.out.println("element at before index" + i + "is" + arr[i]);

             //0 => 101
             //1 => 202

             //0 => 201
             //1 => 101

             int temp = 0;
             temp = arr[0];
             arr[0] = arr[1];
             arr[1] = temp;
             System.out.println("===================");
         }

             for( int i = 0; i<arr.length; i++)
             System.out.println("Element at after index" +i +"is"+arr[i]);


         }
    }

