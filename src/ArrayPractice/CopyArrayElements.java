package ArrayPractice;

public class CopyArrayElements {
    public static void main(String[] args) {
        int[] array = {3,2,5,6,8,10,9,4,1,7};
        //3 2 5 6 8 10  9 4 1 7
        //0 1 2 3 4  5  6 7 8 9

        int[]dummy = new int[array.length];
        for(int i = 0; i<array.length; i++){
            dummy[i] = array[i];
            //i = 0             array[0] = 3   array[1] = 2
            //dummy[0] = 3      array[1] = 2
            //dummy[1] = 2
            //dummy[5] = 10
        }
       for(int j = 0; j<dummy.length;j++) {
           System.out.println("elements in copied array are " +dummy[j]);
       }
    }
}
