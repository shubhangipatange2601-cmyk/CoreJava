package OperatorPrograms;

public class DecreOpPostAndPre {
    //Programs Using Pre&Post Decrement Operators

    public static void main(String[] args) {
        int a = 500;
        int b = 800;

        System.out.println("PostDecrement: "+(a--));
        System.out.println("PreDecrement: "+(--a));

        System.out.println("PostDecrement: "+(b--));
        System.out.println("PreDecrement: "+(--b));


        int f = 3000;
        int g = 4000;
        System.out.println("PostDecrement:"+(f--));
        System.out.println("PreDecrement:"+(--f));

        System.out.println(("PostDecrement: "+(g--)));
        System.out.println(("PreDecrement: "+(--g)));

    }


}
