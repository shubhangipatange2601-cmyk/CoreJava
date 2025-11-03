package AccessModifiers.P2;

import AccessModifiers.P1.P1class;

//Different package subclass

public class P2class extends P1class {
    public static void main(String[] args) {
        P2class child = new P2class();
        child.test();
    }
}
