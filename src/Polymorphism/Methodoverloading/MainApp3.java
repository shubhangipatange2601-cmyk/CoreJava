package Polymorphism.Methodoverloading;

public class MainApp3 {
    void m1(int no1,String str1 ){
        System.out.println( no1+" +str1");
    }

    void m1(String str1, int no1){
        System.out.println(str1+ " +no1");
    }

    void m1(){
        System.out.println("Hello ");
    }

    public static void main(String[] args) {
        MainApp3 obj = new MainApp3();
        obj.m1(10,"kamal");
        obj.m1("Deepak",20);
        obj.m1();
    }
}
//order of parameters changed