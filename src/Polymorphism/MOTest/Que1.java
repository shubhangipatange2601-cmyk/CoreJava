package Polymorphism.MOTest;
class A{
    void show(){
        System.out.println("Show method of class A ");
    }
}
class B extends A{

}
class C extends B{

}

public class Que1 {
    static void overloadedMethod(A a){
        System.out.println("One ");
    }
    static void overloadedMethod(B b){
        System.out.println("Two ");
    }

    static void overloadedMethod(Object obj){
        System.out.println( "Three ");
    }

    public static void main(String[] args) {
        C c = new C();
        overloadedMethod(c);
    }
}



