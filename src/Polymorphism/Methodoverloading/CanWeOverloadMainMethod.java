package Polymorphism.Methodoverloading;

public class CanWeOverloadMainMethod {
    public static void main(String[] args) {
        System.out.println("Hello 1 ");

        CanWeOverloadMainMethod obj = new CanWeOverloadMainMethod();
        obj.main();
        obj.main(new int[]{10,20,30});
    }

    public static void main(){
        System.out.println("Hello2 ");
    }

    public static void main(int[]args){
        System.out.println("Hello 3 ");
    }
}
