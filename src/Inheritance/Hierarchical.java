package Inheritance;
//Parent class
class Parent11{
    void show(){
        System.out.println("Show method of Parent11 ");
    }
}

//child class 1
class child22 extends Parent11{
    void act(){
        System.out.println("act method of child22 ");
    }
}

//child class 2
class child33 extends Parent11{
    void add(){
        System.out.println("Add method of child33 ");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        //Object of child class 1
        child22 c = new child22();
        c.show();       //Inherited from Parent
        c.act();       // child class method

     //OBJET OF CHILD33
        child33 C = new child33();
        C.show();       //Inherited from Parent
        C.add();        //child33 method
    }
}
