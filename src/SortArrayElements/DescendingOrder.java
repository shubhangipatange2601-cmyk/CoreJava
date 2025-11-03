package SortArrayElements;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //Descending order

        for (int i = 0; i<array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        for(int i = 0; i< array.length; i++){
            System.out.println("element in array" + array[i]);
        }

    }
}