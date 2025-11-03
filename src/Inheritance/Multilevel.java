package Inheritance;

class Animal{
    void eat(){
        System.out.println("eat method ");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks ");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("The puppy weeps ");
    }
}

//Main class
public class Multilevel {
    public static void main(String[] args) {
        //Object of puppy
        Puppy p = new Puppy();
        p.eat();        //From animal
        p.bark();       //From Dog
        p.weep();       //From puppy
    }
}
