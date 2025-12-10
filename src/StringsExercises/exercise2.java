package StringsExercises;

public class exercise2 {
    //Declare intialize a string variable "str"with the value
    public static void main(String[] args) {
        String str = "shubhangipatange";
        //print original string
        System.out.println("Original String : " + str);

        //Retrive the unicode code point at index 1 in string.
        int val1 = str.codePointAt(1);


        int val2 = str.codePointAt(5);
        System.out.println("Character (unicode point) = " + val1);
        System.out.println("Character (unicode point) " + val2);
    }
}
