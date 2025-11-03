package SwapPractice;

public class SwapArray1 {
    public static void main(String[] args) {
        int[] abb = {300,400};
        for(int i = 0; i<abb.length; i++) {
            System.out.println("element at before index" + i + "is" + abb[i]);

            //0 = 300
            //1 = 400

            int temp = 0;
            temp = abb[0];
            abb[0] = abb[1];
            abb[1] = temp;
            System.out.println("=============");
        }

        for(int i = 0; i<abb.length; i++){
            System.out.println("element present at after index" + i + "is" + abb[i]);
        }

        }
    }

