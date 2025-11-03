package OperatorPrograms;

public class AssOpString3 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("a = a+2:"+(a+=2));
        System.out.println("a = a-4:"+(a-=4));
        System.out.println("a = a*6:"+(a*=6));
        System.out.println("a = a/8:"+(a/=8));
        System.out.println("a = a%3:"+(a%=3));

        double d = 20.34;
        System.out.println("a = a+9:"+(a+=9));
        System.out.println("a = a-10:"+(a-=10));
        System.out.println("a = a*2: "+(a*=2));
        System.out.println("a = a/12:"+(a/=12));
        System.out.println("a = a%4:"+(a%=4));

        int g = 20;
        System.out.println("g = g+5:"+(g+=5));
        System.out.println("g = g-8:"+(g-=8));
        System.out.println("g = g*2:"+(g*=2));
        System.out.println("g = g/1:"+(g/=1));
        System.out.println("g = g%2:"+(g%=2));



    }

}
