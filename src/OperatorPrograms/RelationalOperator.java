package OperatorPrograms;

public class RelationalOperator {

    public static void main(String[] args) {
        //== equal to
        int a = 100;
        int b = 100;
        boolean checkEquality = (a==b);
        System.out.println("Check equality +"+checkEquality);

        //=!, not equal to
        boolean checkNotEquality = (a!=b);
        System.out.println("Check not equality +"+checkNotEquality);

        //<, less than
        int c = 100;
        int d = 200;
        boolean ChecksLessThan = (c<d);
        System.out.println("Check less than + "+ChecksLessThan);

        //<=, less than or equal to
        boolean ChecksLessThanEqual = (c<d);
        System.out.println("Checks less than equal +"+ChecksLessThanEqual);

        //>, Greater than
        int e = 1000;
        int f = 700;
        boolean GreaterThan = (e>f);
        System.out.println("checks greater than +"+GreaterThan);

        int q = 1000;
        int w = 1000;
        GreaterThan = (q > w);
        System.out.println("Checks greater than +"+GreaterThan);

        //>=, Greater than equal to
        int h = 1000;
        int i = 1000;
        boolean greaterThanEqual = (h>=i);
        System.out.println("Checks greater than equal +"+greaterThanEqual);

    }
}
