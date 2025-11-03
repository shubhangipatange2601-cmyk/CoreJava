package Constructor;
class PrivateParentCon{
    PrivateParentCon(){
        System.out.println("Parent class constructor ");


    }

public class ParentClassPrivateCon  extends PrivateParentCon {
        ParentClassPrivateCon(){
            System.out.println("Child class Constructor ");
        }

    public static void main(String[] args) {
        PrivateParentCon Parent = new PrivateParentCon();   //Parent class
    }
    }
}
