package FlowControlStatements;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        int c = 3000;
        if(a<b && a<c){
            System.out.println("a is lesser of among three values");

        }else if(b<a && b<c){
            System.out.println("b is lesser of among three values");

        }else if(c<a && c<b){
            System.out.println("c is lesser of among three values");

        }else{
            System.out.println("all among values are equal");
        }

    }
}

