package FlowControlStatements;

public class IfElseStatement {
    public static void main(String[] args) {
        //If else statements
        //voting
        //if age > 18 => You can cast your vote
        //else=> You can not cast your vote

        int age = 18;
        if(age>18){
            System.out.println("You can vote");
        }else{
            System.out.println("No you can not vote");
        }

        if(age>=18){
            System.out.println("You can vote");

        }else{
            System.out.println("No you can not vote");
        }
    }
}
