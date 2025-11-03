package OperatorPrograms;

public class ArithmeticOperators {

    public static void main(String[] args) {
            //using the addition '+' operator
            int a = 20;
            a = a + 20;
            System.out.println(a);

            //Using - (Subtraction) Operator
            int b = 100;
            b = b - 50;
            System.out.println(b);


            // Declare and initialize variables
            int aa = 200;
            int bb = 100;
            // Using the + (addition) operator
            int sum = aa + bb ;
            System.out.println("The Sum is: "+sum);
            //using the - (subtraction) operator
            int diff = aa - bb;
            System.out.println("The Difference is: "+diff);


            //Declare and initialise variables
            int abc = 3000;
            int bcd = 1000;
            //Addition
            int add = abc + bcd ;
            System.out.println("This Sum is: "+add);



            //Declare and initialise the variables
            int Jan = 3000;
            int Feb = 2000;
            //Subtraction
            int sub = Jan - Feb ;
            System.out.println(" This Difference is :"+sub);


            // Arithmetic operators on integers
            int c = 20;
            int d = 5;
            System.out.println("c + d = " + (c + d));       //25
            System.out.println("c - d = " + (c - d));       //15
            System.out.println("c * d = " + (c * d));       //100
            System.out.println("c / d = " + (c / d));       //4
            System.out.println("c % d = " + (c % d));       //0

            //Unary operators
            //post increment operators
            //increment value of variable by 1
            //Use value first, then increments

            int s = 100;
            System.out.println(" Post increment"+s++);     //100
            System.out.println("incremented value"+s);     //101


            int e = 201;
            System.out.println("Post increment"+e++);      //201
            System.out.println("incremented value"+e);     //202

            long l = 3456;
            System.out.println("Post increment"+l++);      //3456
            System.out.println("Incremented value" +l);    //3457

            double g = 12.2;
            System.out.println("post increment"+g++);     //12.2
            System.out.println("Incremented value"+g++);  //12.3


            //Pre increment
            //increments value of variable by 1
            //Increment first, then the use value

            int n = 300;
            System.out.println(++n);   //301
            System.out.println(d);     //301

            int aaa = 1000;
            System.out.println(++aaa);   //1001
            System.out.println(aaa++);   //1001
            System.out.println(aaa);     //1002

            double ss = 290;
            System.out.println(++ss);     //291
            System.out.println(ss++);     //291
            System.out.println(ss);       //292

            long ccc = 234567;
            System.out.println(++ccc);    //234568
            System.out.println(ccc);      //234568


        }
    }
    
