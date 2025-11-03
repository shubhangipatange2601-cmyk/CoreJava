package Test;
public class DuplicateArray {
        public static void main(String[] args) {
            int[] array = { 12,23,34,45,12,34,54,56,23};
            System.out.println("Duplicate elements in array is: ");
            for(int i = 0; i<array.length; i++){
                for(int j = i+1; j<array.length; j++){
                    if(array[i] == array[j]){
                        System.out.println(array[j]);

                    }
                }
            }
        }
    }

