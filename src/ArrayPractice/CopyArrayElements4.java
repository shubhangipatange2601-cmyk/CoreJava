package ArrayPractice;

public class CopyArrayElements4 {
    public static void main(String[] args) {
        int[] array = {10,20,40,50,60,70};
        int[] dummy = new int [array.length];

        for(int i = 0; i<array.length; i++){
            dummy[i] = array[i];

        }
        for(int j = 0; j<array.length; j++){
            System.out.println("element in copied array are " + dummy[j]);
        }

    }
}
