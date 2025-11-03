package ArrayPractice;

public class WhileLoop {
    public static void main(String[] args) {
        int[]array = {1,4,6,7,3,5,2};
        //array length = 7
        int index = 0;
        while(index<array.length){
            System.out.println("element present at index " + index + "is " +array[index]);
             index++;
        }

    }
}
