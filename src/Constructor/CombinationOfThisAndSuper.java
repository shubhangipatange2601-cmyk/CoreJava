package Constructor;

class ThisParent{
    ThisParent(){
        System.out.println("no-arg constructor of Parent class ");
    }
}

public class CombinationOfThisAndSuper extends ThisParent {

    CombinationOfThisAndSuper(){
        this(100,"Java Program");  //call same class 2-arg constructor
        System.out.println("no-arg Constructor ");
    }

    CombinationOfThisAndSuper(int age,String name){
        System.out.println("2- arg constructor ");
    }

    CombinationOfThisAndSuper(int age,String name,boolean t){
        this();  //Call same class no-arg constructor
       // super();
        System.out.println("3-arg Constructor ");
    }

    public static void main(String[] args) {
        CombinationOfThisAndSuper obj = new CombinationOfThisAndSuper(100,"Java", true);
    }
}
