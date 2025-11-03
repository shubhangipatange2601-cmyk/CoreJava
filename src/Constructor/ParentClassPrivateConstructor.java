package Constructor;

class PrivateParentConstructor{

    PrivateParentConstructor(){
        System.out.println("Parent class Constructor ");
    }
}

public class ParentClassPrivateConstructor extends PrivateParentConstructor {

    ParentClassPrivateConstructor() {
        System.out.println("This is Parent class Private Constructor ");
    }

    public static void main(String[] args) {

        PrivateParentConstructor Parent = new PrivateParentConstructor();   //Parent class
    }
}