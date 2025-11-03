package Inheritance;
class Animal1{
    void eat(){
        System.out.println("Eat method ");
    }
}

class Dog1 extends Animal{
    void bark(){
        System.out.println("Bark method ");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.eat();           //Inherited from Animal1
        dog1.bark();          //Defined in Dog1
    }
}
