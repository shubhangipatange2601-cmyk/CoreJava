package ArrayAndLoops;

public class OddEvenElements {
    public static void main(String[] args) {
        int [] array= {10,32,55,64,78,97,33,21,90};

        //odd- 55,97,33,21
        //Even-10,32,64,78,90
        for(int i=0; i<array.length-1; i++){
            //i=0           10
            if (array[i] % 2 == 0){
                System.out.println("Element"+array[i] + "is Even number");
            } else{
                System.out.println("element" + array[i] + "is odd number");
            }

        }
    }
}
