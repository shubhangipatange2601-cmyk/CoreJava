package FlowControlStatements;

public class GreaterOfThree {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=300;

        if(a>b && a>c){
            System.out.println("a is greatest of three");
        } else if (b>a && b>c) {
            System.out.println("b is greatest of three");

        }
        else if(c>a && c>b){
            System.out.println("c is greatest of three");
        }
    }
}



