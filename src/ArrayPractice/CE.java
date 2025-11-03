package ArrayPractice;

public class CE {
    public static void main(String[] args) {
        int[]array = {2,4,3,56,66,76};
        int[]dummy = new int[array.length];

        for(int i = 0; i<array.length;i++){
            dummy[i] = array[i];
        }

        for(int j = 0; j<array.length; j++){
            System.out.println(" elements in copied  array are " + dummy[j]);
        }
    }
}
