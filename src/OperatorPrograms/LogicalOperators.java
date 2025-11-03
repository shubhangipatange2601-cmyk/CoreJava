package OperatorPrograms;

public class LogicalOperators {
    //&&, Logical AND
    //when both conditions are true it returns 'true'
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        boolean logicalAnd = (a<b) && (b<c);
        System.out.println("Checks logical and +"+logicalAnd);

        boolean logicaLAnd = (a>b) && (b<c);
        System.out.println("Checks logical and +"+logicaLAnd);


        //||,LogicalOR
        //Returns true if at least one condition is true
        boolean logicalOr = (a>b) || (b<c);
        System.out.println("Check logical or +"+logicalOr);

        boolean logicalOR = (a>b) || (b>c);
        System.out.println("Check logical or +"+logicalOR);


        //!, logicalNot
        //returns true when a condition is false and vice versa
        boolean logicalNot1 = !((a>b) ||(b<c));
        System.out.println("Check logical Not1 +"+logicalNot1);

        boolean logicalNot2 = !((a<b) || (b>c));
        System.out.println("Check logical Not2 +"+logicalNot2);

        boolean logicalNot3 = !((a<b) && (b>c));
        System.out.println("Check Not3 +"+logicalNot3);



    }


}
