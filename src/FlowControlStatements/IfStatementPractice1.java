package FlowControlStatements;

public class IfStatementPractice1 {
    public static void main(String[] args) {
        //if statement
        int b = 345;
        if(b==345 || b<400){
            if(b<400){
                System.out.println("b is less than 400");
            }
            //Nested if
            if(b<360){
                System.out.println("b is less than 360");
            }else{
                System.out.println("b is greater than 400");
            }

        }
    }
}
