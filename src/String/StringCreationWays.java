package String;

public class StringCreationWays {
    public static void main(String[] args) {

        //1) Using new keyword
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s5 = new String("Java");

        //Creates 2 objects
        //1 Heap
        //1 SCP for future purpose

        //In case of new keyword,it will always create a new Object.


        //2) String literals
        String s3 = "Java Program";   //Better memory management
        //J a v a P r o g r a m
        //0 1 2 3 4 5 6 7 8 9 10
        System.out.println("length "+ s3.length());  //11 12 10
        System.out.println("Char present at index " +s3.charAt(1));
        System.out.println("Char present at index "+ s3.indexOf("a"));

        char[] charArray = s3.toCharArray();

        String s = "Java";  //better memory management
        String s4 = "Java";
        String s6 = "Java";    //3+1
        String s7 = s6.concat("program");  //Java program
        s7 = s7.concat("language");        //Java Program Language
        System.out.println("Print s7 object " +s7);

        //In case of string literals we first check whether Object is already
        // present in
        //string Constant Pool(SCP) or not, if the object is Present,we use same
        // object else if object
        //is not present it will create a new object


    }
}
