package ArrayAndLoops;

public class OddEVEN2 {
    public static void main(String[] args) {
        int[]array = {22,32,33,45,55,57,67,48,88,90,76};
        //Odd - 33,45,55,57,67,
        //Even - 22,32,48,88,90,76

        for(int i =0; i<array.length-1; i++){
            //i = 0
            if(array[i]%2 == 0){
                System.out.println("element" + array[i] + "is even number");

            }else{
                System.out.println("element" +array[i] + "is odd number");
            }

        }
    }
}
