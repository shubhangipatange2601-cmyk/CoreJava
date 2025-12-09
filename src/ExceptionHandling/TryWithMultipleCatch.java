package ExceptionHandling;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4,5,6};
            System.out.println(arr[1]);

            TryWithMultipleCatch obj = new TryWithMultipleCatch();
            obj.test();      //NPE

            int result = 100/0;
            System.out.println("Result is " +result);
        } catch (ArrayIndexOutOfBoundsException aib){
            System.out.println("Got ArrayIndexOutOfBoundException " +aib.getCause());

        }catch (NullPointerException npe){
            System.out.println("Got NullPointerException "+ npe.getCause() );

        }catch (ArithmeticException ame){
            System.out.println("Got ArithmeticException "+ame.getCause());
        }
    }

    void test(){
        System.out.println("Test method ");
    }

    int divide(int a,int b){
        return a/b;
    }
}
