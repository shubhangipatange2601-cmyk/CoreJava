package SortArrayElements;

public class AscendingOrder1 {
    public static void main(String[] args) {
        int[] array = {900, 800, 700, 600, 500, 400, 300, 200, 100};

        for (int i = 0; i < array.length; i++) {
            //0 = 900

            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("element in array" + array[i]);
        }
    }
}