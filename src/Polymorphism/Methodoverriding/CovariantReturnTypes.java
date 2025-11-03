package Polymorphism.Methodoverriding;

public class CovariantReturnTypes {
    void test() {

    }

    int add() {
        return 100;

    }

    //can a method returns an object of a class?
    String returnString() {
        String s = new String("Java");  //String obj
        return s;

    }

    CovariantReturnTypes returnObj() {
        CovariantReturnTypes obj = new CovariantReturnTypes();
        return obj;
    }
}