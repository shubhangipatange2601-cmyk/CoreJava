package ArrayAndLoops;


public class OddEVEN1 {
    public static void main(String[] args) {
        int[]array = {10,32,44,65,67,87,98,56};
        //odd = 65,67,87
        //Even = 10,32,44,98,56
        //length = 8
        //MinIndex = 0
        //MaxIndex = 7

        for(int i = 0; i<array.length-1; i++){
            //i = 0

            if(array[i] % 2 == 0){
                System.out.println("Element" + array[i] + "is Even number");

            }else{
                System.out.println("Element" + array[i] + "is odd number");
            }
        }
    }
}
