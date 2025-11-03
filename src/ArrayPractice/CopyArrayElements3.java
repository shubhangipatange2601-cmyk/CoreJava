package ArrayPractice;

public class CopyArrayElements3 {
    public static void main(String[] args) {
        int []array = {30,40,50,60,70,89,10};
        int[]copy = new int [array.length];

        for(int i = 0; i < array.length; i++){
            copy[i] = array[i];


            }
        for(int j = 0; j < copy.length; j++){
            System.out.println(" elements copied array are " + copy[j]);


        }

    }
}
