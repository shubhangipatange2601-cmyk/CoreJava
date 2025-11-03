package Polymorphism.Methodoverloading;

// Here type of parameters are different


public class MainApp2 {
    void m1(int no1){

    }

    void m1(String str1){
        System.out.println("String : " + str1);
    }

    public static void main(String[] args) {
        MainApp1 obj = new MainApp1();
        obj.m1(10);
        obj.m1(10,20);
    }
}
//method overloading if Type of parameter different compiler
//does not get confuse and execute the program well.
//(Here we can type of parameters are different.public class MainApp2 {
