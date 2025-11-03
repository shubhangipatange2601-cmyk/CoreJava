package ArrayPractice;

import java.sql.SQLOutput;

public class Darray2 {
    public static void main(String[] args) {
        int[]array = {2,3,2,4,5,6,5,8,6};
        System.out.println("Duplicate elements in array ");
        for(int i = 0; i<array.length; i++){

            for(int j = i + 1 ; j<array.length; j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
