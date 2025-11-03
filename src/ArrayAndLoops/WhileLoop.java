package ArrayAndLoops;

public class WhileLoop {
    public static void main(String[] args) {
        int[]array = {10,20,30,40,50};
        //length = 5
        int index = 0;
        while(index<array.length){
            System.out.println("element present at index " + index + " is " +array[index]);
            index++;

        }
    }
}
