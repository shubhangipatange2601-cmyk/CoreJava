package SortArrayElements;

public class AscendingOrder2 {
    public static void main(String[] args) {
        int[]array = {34,87,89,60,32,20,40,90,86,56};
        for(int i = 0; i<array.length; i++){
            //0 = 34

            for(int j= 0; j<array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println("element in array" + array[i]);
        }
    }
}
