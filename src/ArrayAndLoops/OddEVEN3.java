package ArrayAndLoops;

public class OddEVEN3 {
    public static void main(String[] args) {
        int[]array = {33,29,24,54,60,66,89,};
        for(int i = 0;i<array.length-1;i++){
            if(array[i] % 2 == 0){
                System.out.println("element" +array[i] + "is even");

            }else{
                System.out.println("element" + array[i] + "is odd");
            }
        }
    }
}
