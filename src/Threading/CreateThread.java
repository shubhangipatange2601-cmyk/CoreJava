package Threading;

public class CreateThread  extends Thread {
    public static void main(String[] args) {
        CreateThread obj1 = new CreateThread();
        obj1.setName("Thread1");
        obj1.start();

        System.out.println("current Thread name " + Thread.currentThread().getName());    //Thread1


        CreateThread obj2 = new CreateThread();
        obj2.setName("Thread2");
        obj2.start();

        System.out.println("Current Thread name " + Thread.currentThread().getName());  //
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Current Thread name "+ Thread.currentThread().getName());
    }
}



