package Polymorphism.Methodoverloading;

public class MainApp1 {
    void m1(int no1){

    }

    void m1(int no1,int no2){
        System.out.println("Result : "+ (no1+no2));
    }

    public static void main(String[] args) {
        MainApp1 obj = new MainApp1();
        obj.m1(10);
        obj.m1(10,20);
    }
}
//method overloading if no of parameter different compiler
//does not get confuse and execute the program well.
//(Here we can no of parameters are different.