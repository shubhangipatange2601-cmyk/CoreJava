package OperatorPrograms;

public class LogicalString1 {
    public static void main(String[] args) {
        int a = 2000;
        int b = 3000;
        int c = 4000;
        boolean logicalAnd = (a<b) && (b<c);
        System.out.println("checks logical And "+logicalAnd);

        boolean logicalOr = (a>b) ||(b<c);
        System.out.println("checks logical Or "+logicalOr);

        boolean logicalNot = !((a>b)) ||(b>c);
        System.out.println("checks logical Not "+logicalNot);

        boolean logicalNot1 = !((a<b)) ||(b<c);
        System.out.println("checks logical Not1 "+logicalNot1);

        boolean logicalNot2 = !((a<b))||(b>c);
        System.out.println("Checks logical Not2 "+logicalNot2);
    }
}
