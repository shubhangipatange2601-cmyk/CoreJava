package ArrayAndLoops;

public class SortArrayElements {
    public static void main(String[] args) {
        int[] array = {3,2,6,9,10,1,4,8,5,7};
        //3 2 6 9 10 1 4 8 5 7
        //0 1 2 3 4  5 6 7 8 9
        //ascending  1 2 3 4 5 6 7 8 9 10

        for(int i = 0; i < array.length; i++){
            //0 = 3

            for(int j = 0; j<array.length; j++){

                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        for(int i =0; i<array.length; i++){
            System.out.println("Element in array"+array[i]);

            //sorting algorithms


        }
    }
}
