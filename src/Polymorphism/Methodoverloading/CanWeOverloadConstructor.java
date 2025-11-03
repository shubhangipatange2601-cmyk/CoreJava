package Polymorphism.Methodoverloading;

public class CanWeOverloadConstructor {
    CanWeOverloadConstructor(){
        System.out.println("Hello 1 ");
    }

    CanWeOverloadConstructor(int no){
        System.out.println("Hello "+no );
    }
    public static void main(String[]  args) {
        new CanWeOverloadConstructor();
        new CanWeOverloadConstructor(10);

    }
}
