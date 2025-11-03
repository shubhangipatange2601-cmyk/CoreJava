package BasicJava;

public class WideningNarrowing {

        public static void main(String[]args) {

            int myInt = 9;
            double myDouble = myInt;


            //Widening

            byte bb = 100;
            short ss= bb;
            int ii = bb;
            float ff = bb;
            long ll = bb;
            double dd = bb;



            byte abs = 98;
            short bcs = abs;
            int dsc = abs;
            float cds = abs;
            long tcs = abs;
            double rcs = abs;


            byte abcd = -113;
            short drcd = abcd;
            int gfcd = abcd;
            float trcd = abcd;
            long ytcd= abcd;
            double iucd = abcd;


            //narrowing

            double dc = 90000;
            int iii = (int) dc;
            byte bbb = (byte) dc;




            double MyDouble = 11;
            int MyInt = (int) MyDouble;
            System.out.println(MyDouble);
            System.out.println(MyInt);


            short maxShort = 2343;
            byte maxByte = (byte) maxShort;
            System.out.println(maxShort);
            System.out.println(maxByte);



            int MinInt = 10009;
            short MinShort = (short) MinInt;
            System.out.println(MinInt);
            System.out.println(MinShort);

        }
    }

