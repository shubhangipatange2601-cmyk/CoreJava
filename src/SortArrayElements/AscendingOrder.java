package SortArrayElements;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {12,56,87,65,40,34,90,100};
        //12,56,87,65,40,34,90,100
        // 0  1  2  3  4  5  6  7

        //ascending 12,34,40,56,65,87,90,100

        for(int i = 0; i < array.length; i++){
            //0 = 12

            for(int j = 0; j < array.length; j++){

                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i< array.length; i++){
            System.out.println("element in array" +array[i]);
        }
    }
}

