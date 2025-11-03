package OperatorPrograms;

public class DecrementOperators {

        public static void main(String[] args) {
            //Decrement by 1
            //Post decrement
            //Uses value first then decrement
            int a = 1000;
            System.out.println(a--);  //1000
            System.out.println(a);    //99

            int d = 300;
            System.out.println(d--);   //300
            System.out.println(d);     //299

            double s = 101.23;
            System.out.println(s--);    //101.23
            System.out.println(s);      //100.23

            int f = 2000;
            System.out.println(f--);    //2000
            System.out.println(f);      //2001


            //Pre decrement
            //decrement first then uses value
            int r = 230;
            System.out.println(--r);    //229
            System.out.println(--r);    //228
            System.out.println(r);      //197


            double g = 33.12;
            System.out.println(--g);    //32.12
            System.out.println(--g);    //31.12
            System.out.println(g);     //30.12


            //invert (!)
            boolean t = true;
            System.out.println("Value after invert"+!t);

            boolean h = false;
            System.out.println("Value after invert"+!h);


        }
    }

