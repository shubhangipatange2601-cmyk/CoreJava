package FlowControlStatements;

public class NestedIfStatements {
    public static void main(String[] args) {
        //Nested if statements
        //Will be executed if statement of above is true

        int i = 10;
        if(i==10 || i<15){
            //First if statement
            if(i<15)
            System.out.println("i is smaller than 15");
        }
        //Nested if statement
        if(i<12){
            System.out.println("i is smaller than 12 too");

        }else{
            System.out.println("i is greater than 15");
        }

        int j = 14;
        if(j==14 ||j<15){
            //First if statement
            if(j<15){
                System.out.println("j is smaller than 15");
            }
            //Nested if statement
            if(j<12){
                System.out.println("j is smaller than 12 too");
            }else{
                System.out.println("j is greater than 15");
            }
        }
    }
}
