package OperatorPrograms;

public class DecreOpPostDecrement1 {
    public static void main(String[] args) {
        //Post Decrement Operators
        //Uses value first then decrement
        int a = 200;
        System.out.println(a--);
        System.out.println(a);

        int d = 3345;
        System.out.println(d--);
        System.out.println(d);

        int f = 5000;
        System.out.println(f--);
        System.out.println(f);

        int g = 3590;
        System.out.println(g--);
        System.out.println(g);

        int c = 10;
        int b = 10;
        System.out.println("PostDecrement : "+(c--));
        System.out.println("PostDecrement: "+(c));

        //Pre decrement
        System.out.println("PreDecrement:"+(--b));
        System.out.println("PreDecrement:"+(b));

    }


}




