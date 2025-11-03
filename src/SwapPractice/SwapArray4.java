package SwapPractice;

public class SwapArray4 {
    public static void main(String[] args) {
        int[]array = {432,345};
        for(int i = 0; i<array.length; i++)
            System.out.println("element at before index" + i + "is" + array[i]);

        //0 = 432
        //1 = 345

        int temp = 0;
        temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        System.out.println("=================");

        for(int i = 0; i<array.length; i++)
            System.out.println("element at after index" + i+ "is" + array[i]);
    }
}
