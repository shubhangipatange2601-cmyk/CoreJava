package ArrayPractice;

public class ce1 {
    public static void main(String[] args) {
        int[]array = {2,3,4};
        int[]dummy = new int[array.length];
        for(int i = 0; i < array.length; i++){
             dummy[i] = array[i];

        }
        for(int j = 0; j<array.length; j++){
            System.out.println("elements in copied array are " + dummy[j]);
        }
    }
}
