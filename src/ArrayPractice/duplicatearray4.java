package ArrayPractice;

public class duplicatearray4 {
    public static void main(String[] args) {
        int[] array = {12, 32, 43, 54, 12, 54};
        System.out.println("Duplicate element in this array is:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
