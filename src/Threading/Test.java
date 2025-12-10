package Threading;

public class Test implements Runnable{
    @Override
    public void  run() {
        System.out.println("thread task1");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Thread th = new Thread(t);
        th.start();
    }
}

