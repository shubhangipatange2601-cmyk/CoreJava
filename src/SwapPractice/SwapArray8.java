package SwapPractice;

public class SwapArray8 {
    public static void main(String[] args) {
        int[]aer = {89,90};

        for(int i = 0; i<aer.length; i++)
            System.out.println("element present before index" +i+"is"+aer[i]);

        int temp = 0;
        temp = aer[0];
        aer[0] = aer[1];
        aer[1] = temp;

        System.out.println("=========================");
        
        for(int i = 0; i<aer.length; i++)
            System.out.println("element present after index" +i +"is" +aer[i]);

    }
}
