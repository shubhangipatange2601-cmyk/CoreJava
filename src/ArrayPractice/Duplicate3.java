package ArrayPractice;

public class Duplicate3 {
    public static void main(String[] args) {
        int[]array = {2,3,4,2,3,6,7};
        System.out.println("Duplicate elements in array " );

        for(int i = 0; i<array.length;i++){
            for(int j = i + 1; j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
