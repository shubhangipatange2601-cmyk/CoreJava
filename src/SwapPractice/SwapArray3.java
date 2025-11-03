package SwapPractice;

public class SwapArray3 {
    public static void main(String[] args) {
        int[]xyz = {400,500};
        for(int i = 0; i<xyz.length;i++)
            System.out.println("element at before index" +i+ "is" + xyz[i]);

        //0 = 400
        //1 = 500

        int temp = 0;
        temp = xyz[0];
        xyz[0] = xyz[1];
        xyz[1] = temp;
        System.out.println("==========");

        for(int i = 0; i<xyz.length; i++)
            System.out.println("element at after index" +i+"is"+ xyz[i]);

    }
}
