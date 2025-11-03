package LoopPractice;

public class ForLoopDecrement {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,8,9,10};
        for(int  i  =  array.length - 1; i>0; i--){
            System.out.println("element present at index " + i + " is " + array[i]);
        }
    }
}
