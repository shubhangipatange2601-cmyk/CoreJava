package ArrayAndLoops;

public class ForLoopDecrement {
    public static void main(String[] args) {
        int[]array = {10,20,30,40,50,60,70,80,90,100};

        for(int i = array.length - 1; i>0; i--)
        {
            //size = 10
            //MinIndex = 0
            //MaxIndex = 9(Size-1)
            //10,20,30,40,50,60,70,80,90,10
            // 0  1  2  3  4  5  6  7  8  9
            System.out.println("Element present at index " + i + " is " + array[i]);
        }

    }
}
