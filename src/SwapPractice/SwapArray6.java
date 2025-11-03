package SwapPractice;

public class SwapArray6 {
    public static void main(String[] args) {
        int[] acd = {20,30};
        for(int i = 0; i<acd.length; i++)
            System.out.println("element present at index" +i +"is" +acd[i]);

        //0 = 20
        //1 = 30
        int temp = 0;
        temp = acd[0];
        acd[0] = acd[1];
        acd[1] = temp;
        System.out.println("============");

        for(int i = 0; i<acd.length; i++)
            System.out.println("element present at index" +i+ "is" + acd[i]);

    }
}
