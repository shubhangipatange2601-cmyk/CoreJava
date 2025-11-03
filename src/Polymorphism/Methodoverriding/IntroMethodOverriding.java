package Polymorphism.Methodoverriding;

class Parent {
    int add( int a,int b){
        return a+b;

    }
}

public class IntroMethodOverriding  extends Parent {
    @Override
    int add(int a, int b) {
        return a+ b +10;
    }
}
