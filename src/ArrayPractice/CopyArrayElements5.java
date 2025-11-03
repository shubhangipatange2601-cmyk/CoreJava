package ArrayPractice;

public class CopyArrayElements5 {
    public static void main(String[] args) {
        int[]array = {2,3,45,67,5,6};
        int[]copy = new int[array.length];

        for(int i = 0; i < array.length; i++ ){
            copy[i] = array[i];
        }

        for(int j = 0; j< array.length; j++){
            System.out.println("element in copied array are " +copy[j]);
        }
    }
}
