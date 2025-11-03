package SwapPractice;

public class SwapArray7 {
    public static void main(String[] args) {
        int[]asd = {24,34};
        for(int i = 0; i<asd.length;i++)
            System.out.println("element at before index" + i+"is"+ asd[i]);

        //0 = 24
        //1 = 34

        int temp = 0;
        temp = asd[0];
        asd[0] = asd[1];
        asd[1] = temp;

        System.out.println("=============");

        for(int i = 0; i<asd.length; i++)
            System.out.println("value at after index" + i +"is"+ asd[i]);
    }
}
