package Constructor;

class ConstructorParent {

    ConstructorParent(){
        System.out.println("ConstructorParent class Constructor Parent class no-argument ");
    }

    ConstructorParent(String name){

        System.out.println("Constructor Parent class Constructor Parent class Parameterized ");
    }
}

public class ConstructorChaining extends ConstructorParent {

    ConstructorChaining(){
        System.out.println("ConstructorChaining class Constructor  no-argument ");
    }

    ConstructorChaining(int age){
      //  super();                 //This line added by JVM
        System.out.println("ConstructorChaining class Constructor Child class Parameterized ");
    }

    public static void main(String[] args) {
        ConstructorChaining child = new ConstructorChaining(100);
    }
}
