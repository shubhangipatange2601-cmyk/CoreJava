package FlowControlStatements;

public class IfElseLadder {

        public static void main(String[] args) {
            // int size 40 print message size is M
            // size = 48 print message size is XXL
            //S M L XL XXL XXL
           // int size = 49;
            int size = 38;

            if(size == 38){
                System.out.println("You will t-shirt of Size Small");
            } else if (size == 40) {
                System.out.println("You will t-shirt of Medium ");
            } else if (size == 42) {
                System.out.println("You will t-shirt of Size Large");
            } else if (size == 44) {
                System.out.println("You will t-shirt of Size Extra Large");
            } else if(size == 46){
                System.out.println("You will t-shirt of Size Double Extra Large");
            } else {
                System.out.println("Please enter correct t-shirt size ");
            }

        }
    }

