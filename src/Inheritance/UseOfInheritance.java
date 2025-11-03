package Inheritance;

class Parent{
    int age = 100;
    void test(){
        System.out.println("TEST METHOD ");
    }
}

public class UseOfInheritance extends Parent {
    public static void main(String[] args) {
        Parent OO = new Parent();
        OO.test();

        UseOfInheritance child = new UseOfInheritance();
        System.out.println("Access Parent class variable " + child.age);
        child.test();
    }
}
