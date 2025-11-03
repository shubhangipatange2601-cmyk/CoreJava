package AccessModifiers;

class PrivateParent{
    void test(){
        System.out.println("Test method ");
    }
}

public class PrivateTest extends PrivateParent {
    public static void main(String[] args) {
        PrivateTest obj = new PrivateTest();
        obj.test();
    }
}


/*Whatever private it belongs to the same class only
if parent class method is private it does not belong to the child class.
eg. class PrivateParent{
   private void test(){
       }
 we cannot make private to Parent class method*/