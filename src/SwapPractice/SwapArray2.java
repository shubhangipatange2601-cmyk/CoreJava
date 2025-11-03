package SwapPractice;

public class SwapArray2 {
    public static void main(String[] args) {
        int[] abc = {190,200};
        for(int i = 0; i< abc.length; i++)
        System.out.println("element at before index" +i+ "is" + abc[i]);

        //0 = 190
        //1 = 200

         int temp = 0;
         temp = abc[0];
         abc[0] = abc[1];
         abc[1] = temp;
        System.out.println("================");

        for(int i = 0; i < abc.length; i++)
        System.out.println("element at after index" + i+ "is"+ abc[i] );

    }
}
