package FlowControlStatements;

public class NestedIfpractice1 {
    public static void main(String[] args) {
        int a = 100;
        if(a==100 || a<1000){
            //If statements
            if(a<1000){
                System.out.println("a is smaller than 1000");
            }
            //Nested if statement
            if(a<120){
                System.out.println("a is smaller than 120");
            }else{
                System.out.println("a is greater than 1000");
            }

        }
    }

}
