package Polymorphism.Methodoverloading;

public class MainApp4 {
    void m1(){
        System.out.println("Hello 1 ");
    }

    int m1(int no1){
        System.out.println("Hello 2");
        return 0;

    }

    public static void main(String[] args) {

    }
}
// we cannot achieve method overloading by changing only the return type
//  of method we have to change the List of parameters