package OperatorPrograms;

public class AssOpString2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = a+2:"+(a+=2));
        System.out.println("a = a-4:"+(a-=4));
        System.out.println("a = a*3:"+(a*=3));
        System.out.println("a = a/8:"+(a/=8));
        System.out.println("a = a%1:"+(a%=1));


        int d = 12;
        System.out.println("d = d+6:"+(d+=6));
        System.out.println("d = d-4:"+(d-=4));
        System.out.println("d = d*2:"+(d*=2));
        System.out.println("d = d/8:"+(d/=8));
        System.out.println("d = d%3:"+(d%=3));

        double s = 18.24;
        System.out.println("s = s+5:"+(s+=5));
        System.out.println("s = s-4:"+(s-=4));
        System.out.println("s = s*3:"+(s*=3));
        System.out.println("s = s/6:"+(s/=6));
        System.out.println("s = s%1:"+(s%=1));

    }
}
