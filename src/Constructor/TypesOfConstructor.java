package Constructor;

public class TypesOfConstructor {
    public TypesOfConstructor(){
        System.out.println("This is no-arg ");
    }

    public TypesOfConstructor(int age){
        System.out.println("This is Parameterized ");
    }

    public static void main(String[] args) {
        TypesOfConstructor obj1 = new TypesOfConstructor();
        TypesOfConstructor obj2 = new TypesOfConstructor(10);
    }
}
