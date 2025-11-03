package Inheritance;

public class InheritanceIntro {
    int age;
    void addition(){
        System.out.println("Addition method ");
    }
    void main(){
        System.out.println("Main method ");
    }
    void act(){
        System.out.println("Act method ");
    }
    class INeedAdditionMethod extends InheritanceIntro{
        void addition(){
            System.out.println("Addition method ");
        }
    }


}
