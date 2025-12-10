package StringsExercises;

public class exercise3 {
    public static void main(String[] args) {
        String str = "techjava";
        System.out.println("Original String : " + str);

        int ctr = str.codePointCount(1,7);
        System.out.println("codepoint count = " + ctr);

    }
}
