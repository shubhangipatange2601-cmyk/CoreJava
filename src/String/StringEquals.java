package String;

public class StringEquals {
    //returns true if two strings are identical and false if the strings are
   // different.

    public static void main(String[] args) {
        String s1 = new String("java"); //Heap

        String s2 = "Java";     //SCP
        String s3 = "Java";     //SCP

        //Difference between equals method and == operator
        //== checks for reference
        //equals() checks contents

        boolean t1 = (s1.equals(s2));   //true

        boolean t3 = (s1 == s2);   //false
        boolean t4 = (s3 == s2);   //true

        boolean t2 = (s1.equalsIgnoreCase(s3));   //false

        String p1 = "Java";
        String p2 = "Java";
        String p3 = "Programs";




    }

}
