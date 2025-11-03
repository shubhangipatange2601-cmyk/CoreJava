package ArrayPractice;

public class CopyArrayElements2 {
    public static void main(String[] args) {
        int[]array = {12,34,56,78,89,100,98};
        int[]dummy = new int[array.length];
        for(int i = 0; i<array.length; i++){
            dummy[i] = array[i];

        }
        for(int j = 0; j<dummy.length; j++){
            System.out.println(" elements in copied array are " + dummy[j]);

        }
    }
}
