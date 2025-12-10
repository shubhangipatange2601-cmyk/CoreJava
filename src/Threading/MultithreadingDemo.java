package Threading;

class Task1 extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Task 1 Running: " +i);
        }
    }
}

class Task2 extends Thread {
    public void run(){
        for(int i =1; i<=5; i++){
            System.out.println("Task 2 Running: " + i);
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();    //Thread 1 start
        t2.start();   // Thread 2 start
    }

}
