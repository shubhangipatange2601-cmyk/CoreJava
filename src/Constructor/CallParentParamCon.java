package Constructor;

class Parent1{
    Parent1(){
        System.out.println("Parent Class no-arg constructor ");
    }

    Parent1(String name, int age ){
        System.out.println("Parent class 2 params constructor" );
    }

    Parent1(int age){
        System.out.println("Parent class 1 Parent Constructor ");
    }
}

public class CallParentParamCon extends Parent1 {
    CallParentParamCon(){
        super(100);
        System.out.println("Child class Constructor ");
    }
    CallParentParamCon (int num){
        //super ("Java" 100 );
        //Super java 100
        System.out.println("Child class 1 Param constructor ");
    }

    public static void main(String[] args) {
        CallParentParamCon child = new CallParentParamCon (100);
        System.out.println("===================================");
        CallParentParamCon child1 = new CallParentParamCon();
    }
}



