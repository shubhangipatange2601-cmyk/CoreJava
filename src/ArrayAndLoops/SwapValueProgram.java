package ArrayAndLoops;

public class SwapValueProgram {
    public static void main(String[] args) {
        int a = 110;
        int b = 20;

        //swap method without 3rd variable

        a = a + b;       //130
        b = a - b;       //130 - 20 = 110
        a = a - b;       //130 - 110 = 20
        System.out.println(" Value of a is " + a);
        System.out.println(" Value of b is " +b);


        //Swap using 3rd variable
        int temp = a;      //110
        a = b;             //20
        b = temp;          //110
        System.out.println(" Value of a is " +a);
        System.out.println(" Value of b is " +b);

    }
}
