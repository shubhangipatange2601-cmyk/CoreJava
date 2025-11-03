package ArrayAndLoops;

public class DuplicateElementsInArray {
    public static void main(String[] args) {


        int[]arr = {3,4,5,8,7,6,7,8,3,2,10};
        System.out.println("Duplicate elements in the array:");
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);

                }
            }
        }
    }
}



