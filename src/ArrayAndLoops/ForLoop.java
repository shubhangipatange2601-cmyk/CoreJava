package ArrayAndLoops;

public class ForLoop {
    public static void main(String[] args) {
        //For Loop Practice

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //array length
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        int[] array1 = {100, 200, 300, 400, 500, 600};
        //array length
        for (int i = 3; i < 6; i++) {
            System.out.println("element present at index " + i + " is " + array1[i]);
        }
        int[]array2 = {10,20,30};
        for(int i = 2; i<3; i++){
            System.out.println("element present at index " + i+ " is " +array2[i]);
        }

    }
}
