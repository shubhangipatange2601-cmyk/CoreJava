package String;

public class StringMethods {
    public static void main(String[] args) {
        //1) length()
        String s = "Java";
        System.out.println(s.length());   //4


        //2)CharAt(int index)
        //returns character at the specified index
        String s1 = "Java";
        System.out.println(s.charAt(2));

        //3)indexOf(String str)
        //Returns the index of the first occurance of the given substring
        String s2 = "Java Programming";
        System.out.println(s.indexOf("a"));   //1

        //4)LastIndexOf(String str)
        //Returns the index of the last occurance of the substring
        System.out.println(s.lastIndexOf("a"));    //3


        //5)toUpperCase() / toLowerCase()
        //Converts all the characters to upper or lower case
        System.out.println("java".toUpperCase());   //JAVA
        System.out.println("JAVA".toLowerCase());    //java


        //6)trim()
        //Removes leading and trailing white spaces.
        String s3 = "Java";
        System.out.println(s.trim());   //"JAVA"


        // 7)equals(Object obj)
        //Compares the content of two strings (case-sensitive).
        String s4 = "Java";
        String s5 = "java";
        System.out.println(s1.equals(s2));   //false


        //8)equalsIgnoreCase(String another)
        //Compares strings ignoring case.
        System.out.println(s1.equalsIgnoreCase(s2)); // true


        //9)contains(CharSequence seq)
        //checks wheather a string the specified sequence.
        String s6 = "Java Programming";
        System.out.println("Java");   //true


        //10)startsWith(String prefix) /endsWith(String suffix)
        //Checks whether the string starts or ends with a given substring
        System.out.println(s.startsWith("Java"));  //true
        System.out.println(s.endsWith("ing"));     //true


        //11) substring(int beginIndex) / substring(int begin,int end)
        //Extracts part of a string.
        String s7 = "JavaProgram";
        System.out.println(s.substring(4));   //Program
        System.out.println(s.substring(0,4));           //JAVA


        //12)concat(String str)
        //Joins two strings
        String s8 = "Java";
        String s9 = "Program";
        System.out.println(s1.concat(s2));    //JavaProgram


        //13)replace(char old,char new)
        //Replace all occurrences of a character
        String s10 = "Java";
        System.out.println(s.replace('a','o'));   //Jovo


        //14)split(String regex)
        //Split the string into parts using a given delimiter.
        String s11 = "Java,Python, c++";
        String[] arr = s.split(",");
        for(String lang : arr)
            System.out.println(lang);


        //15) toCharArray()
        //Converts a string into a character array.
        char[] chars = "Java".toCharArray();
        for (char c : chars)
            System.out.println(c);

        //16) isEmpty() / isBlank()(Java 11+)
        //Checks whether a string is empty or blank
        System.out.println("".isEmpty());     //true
        System.out.println(" ".isBlank());     //true

    }


}
