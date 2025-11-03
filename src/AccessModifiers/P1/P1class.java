package AccessModifiers.P1;

class P1Parent{
    public void test(){
        System.out.println("Test method P1Parent ");
    }
}

public class P1class  extends P1Parent{
    public static void main(String[] args) {
        P1class child = new P1class();
        child.test();
    }
}
