package Abstraction;

interface ABCD{
    void test();
}

interface XYZ{
    int add(int a,int b);
    int multiply();
}

public class InterfaceRules implements ABCD,XYZ {
    @Override
    public void test() {
        System.out.println("Test method ");
    }

    @Override
    public int add(int a, int b) {
        return a+b+100;
    }

    @Override
    public int multiply() {
        return 0;
    }
}
