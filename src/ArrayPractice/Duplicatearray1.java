package ArrayPractice;

public class Duplicatearray1 {
    public static void main(String[] args) {
        int[] array = {12, 2, 12, 43, 54, 32, 43, 54};
        System.out.println("Duplicate elements in array: ");
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println(array[j]);

                }
            }
        }
    }
}