package Polymorphism.Runtime;
class A1{
    void m1(){
        System.out.println("m1 method in class A ");
    }

    class B1 extends A1{
        @Override
        void m1(){
            System.out.println("m1 method in class B ");
        }
    }
}

public class MainApp1 {
    public static void main(String[] args) {
       A1 obj = new A1();
        obj.m1();

        //B1 obj2 = new B2();
        //obj2.m2();
        //obj2.m1();

        //B1 obj3 = new A1();

        //A1 obj4 = new B1();
        //obj4.m1();  // method in class B

    }

}
