package Java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyRegexExample {
    //The regex pattern with escaped backslashes for Java string literal
    private static final String CURRENCY_REGEX = "^\\$(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$";

public static boolean isValidCurrency(String input){
    Pattern pattern = Pattern.compile(CURRENCY_REGEX);
    Matcher matcher = pattern.matcher(input);
    return matcher.matches();

}
//Using the standard regex pattern (case insensitive is often recommended)
    private static final String EMAIL_REGEX =
        "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";


    public static boolean isValidEmail(String email){
    Pattern pattern = Pattern.compile(EMAIL_REGEX,Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}

public static void main(String[] args) {
    String email1= "test@example.com";
    String email2= "Invalid-email";
    String email3= "user.name123@sub.domain.co.in";

    System.out.println(email1 + "is valid: " + isValidEmail(email1));
    System.out.println(email1 + "is valid: " + isValidEmail(email2));
    System.out.println(email1 + "is valid: " + isValidEmail(email3));

    String str1 = "$1,234.56";
    String str2 = "$1200";
    String str3 = "$0.99";
    String str4 = "$1,098.09";//Invalid format


    System.out.println(str1 + " is valid: " + isValidCurrency(str1));
    System.out.println(str2 + " is valid: " + isValidCurrency(str2));
    System.out.println(str3 + " is valid: " + isValidCurrency(str3));
    System.out.println(str4 + " is valid: " + isValidCurrency(str4));
}


}
