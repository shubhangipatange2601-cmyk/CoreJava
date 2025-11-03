package OperatorPrograms;

     public class AssignmentOperator {

        public static void main(String[] args) {
            int f = 7;
            System.out.println("f = f+3: +(f+=3)");       //10
            System.out.println("f = f-2: -(f-=2)");      //8
            System.out.println("f = f*4: *(f*=4");       //32
            System.out.println("f = f/3: /(f/3");       //10
            System.out.println("f = f%2: %(f%2)");     //0


            double r = 7.4;
            System.out.println("r = r+2: +(r+=2");      //9.4
            System.out.println("r = r-4: -(r-=4");     //5.4
            System.out.println("r = r*2: *(r*=2");     //10.8
            System.out.println("r = r/3: /(r/3");      //3.6
            System.out.println("r = r%2: %(r%2");     //0


            int d = 6;
            System.out.println("d = d+3: +(d+=3");       //9
            System.out.println("d = d-2: -(d-=2");       //7
            System.out.println("d = d*4: *(d*=4");       //28
            System.out.println("d = d/7: /(d/7");        //4
            System.out.println("d = d%1: % (d%1");       //0


            long l = 100;
            System.out.println("l = l+2: "+(l+=2));      //102
            System.out.println("l = l-4:"+(l-=4));       //98
            System.out.println("l= l*3:"+(l*3));        //294
            System.out.println("l= l/6:"+(l/=6));       //49
            System.out.println("l= l%5: "+(l%=5));      //2

        }
    }

