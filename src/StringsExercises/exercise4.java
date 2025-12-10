package StringsExercises;

public class exercise4 {
    public static void main(String[] args) {
        String str = "techupjava";
        System.out.println("Original String : " + str);

        int val1 = str.codePointBefore(1);
        int val2 = str.codePointBefore(7);

        System.out.println("Character (unicode point ) = " + val1);
        System.out.println("Character (unicode point) = " + val2);
    }
}
