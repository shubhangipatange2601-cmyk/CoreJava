package Polymorphism.Casting;

class Casting{
    void test(){
        System.out.println("Parent class method ");
    }
}

public class MethodOverridingCasting  extends Casting{
    @Override
    void test() {
        System.out.println(" child class method ");
    }
}

class TestCode{
    public static void main(String[] args) {
        Casting up = new MethodOverridingCasting();
        up.test();    //obj type decided which method gets called=> Runtime

        /*Casting p = new Casting();
        p.test();
        MethodOverridingCasting c = new MethodOverridingCasting();
        c.test();*/

    }
}