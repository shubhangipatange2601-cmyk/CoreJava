package OperatorPrograms;

    public class AssOpString4 {
        //Assignment program
        public static void main(String[] args) {
            int s = 12;
            System.out.println("b= b+2:"+(s+=2));   //14
            System.out.println("s= s-4:"+(s-=4));    //10
            System.out.println("s= s*3:"+(s*=3));    //30
            System.out.println("s= s/5:"+(s/=5));   //6
            System.out.println("s= s%1:"+(s%=1));   //0


            double a = 12.3;
            System.out.println("a= a+3:"+(a+=3));   //15.3
            System.out.println("a= a-4:"+(a-=4));   //11.3
            System.out.println("a= a*5:"+(a*=5));   //56.5
            System.out.println("a= a/6:"+(a/=6));   //9.41
            System.out.println("a= a%2:"+(a%=2));   //0.18


            int b = 100;
            System.out.println("b= b+2:"+(b+=2));   //102
            System.out.println("b= b-4:"+(b-=4));   //98
            System.out.println("b= b*3:"+(b*=3));   //294
            System.out.println("b= b/6:"+(b/=6));   //49
            System.out.println("b= b%5:"+(b%=5));   //2

        }

    }


