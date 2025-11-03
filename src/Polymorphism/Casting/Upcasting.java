package Polymorphism.Casting;
 class UpcastingParent{
     void show(){
         System.out.println("Show method of UpcastingParent ");
     }
 }

public class Upcasting  extends UpcastingParent {
     public static void main(String[] args) {
        UpcastingParent parent = new Upcasting();   //Upcasting

         Upcasting child =(Upcasting) new UpcastingParent();

        UpcastingParent p = new UpcastingParent();

    }
}
