package StringsExercises;

public class exercise1 {
    public static void main(String[] args) {
        String str = "Java Exercises !";
        System.out.println("Original String = " + str);

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);


        System.out.println("The character at position 0 is " +
                (char)index1);       //Print the character at position 0 by converting
        // ASCCI value to char.


        System.out.println("The character at position 10 is " +
                (char)index2);    //Print the character at position 10 by converting
        // ASCII value to char.
    }

}
