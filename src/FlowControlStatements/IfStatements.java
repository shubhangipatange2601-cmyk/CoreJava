package FlowControlStatements;

public class IfStatements {
    public static void main(String[] args) {
        //If Statements
        //It is used to decide a certain statement or block of statement will be executed or not
        //If a condition is true then a block of statement is executed otherwise not.
        int a = 100;
        int b = 200;
        if(b>a){
            System.out.println("Value of b is greater that a");
        }
        if(a>b){
            System.out.println("Value of a is greater than b");  //the code does not execute because the condition is fals
        }

        int c = 1000;
        int d = 2000;
        if(c<d){
            System.out.println("Value of c is smaller than d");
        }
        if(d>c){
            System.out.println("Value of d is greater than c");
        }

    }

}
