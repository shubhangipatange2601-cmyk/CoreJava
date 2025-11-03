package OperatorPrograms;

public class AssOpString1 {
    public static void main(String[] args) {
        int f = 4;
        System.out.println("f = f+3: " + (f += 3));
        System.out.println("f = f-2:" + (f -= 2));
        System.out.println("f = f*4: " + (f * 3));
        System.out.println("f = f/5:" + (f / 5));
        System.out.println(("f = f%1:" + (f % 1)));

        double a = 7.2;
        System.out.println("a = a+2: "+(a+=4));
        System.out.println("a = a-3: "+(a-=3));
        System.out.println("a = a*5: "+(a*=5));
        System.out.println("a = a/2: "+(a/=2));
        System.out.println("a = a%1: "+(a%=1));


        int b = 24;
        System.out.println("b = b+6:"+(b+=5));
        System.out.println("b = b-4:"+(b-=4));
        System.out.println("b = b*2:"+(b*=2));
        System.out.println("b = b/4:"+(b/=4));
        System.out.println("b = b%1: "+(b%=1));

    }
}