package ExceptionHandling;

public class WhyHandleException {
    public static void main(String[] args) {
        System.out.println("Start of main method ");
        WhyHandleException obj = null;
        //obj.test();

        try {
            obj.test();
        } catch (Exception e) {
            System.out.println("Got in catch block as code written in try block had some issues ");
            e.printStackTrace();

        }
        try {
            int a = 100 / 10;
            System.out.println("Result of division is " + a);
        } catch (Exception ex) {

        }

        System.out.println("End of the main method ");
    }

        void test(){
            System.out.println("Test method executed ");
        }

}
