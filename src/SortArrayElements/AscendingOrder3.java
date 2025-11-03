package SortArrayElements;

public class AscendingOrder3 {
    public static void main(String[] args) {
        int[]array = {23,11,43,34,56,76,54,78,65};
        //0 = 23

        for(int i = 0; i<array.length; i++){

            for(int j = 0; j<array.length; j++){
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
