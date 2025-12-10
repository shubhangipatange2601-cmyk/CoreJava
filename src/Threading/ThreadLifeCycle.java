package Threading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Running..");
        try {
            Thread.sleep(1000);  //Waiting/block state
        } catch (Exception e) {
            System.out.println("Thread Finished...");
        }
    }

    public class ThreadLifeCycle {
        public static void main(String[] args) {
            MyThread t = new MyThread();
            System.out.println("State 1: " + t.getState());    //NEW

            t.start();
            System.out.println("State 2: " + t.getState());  //Runnable

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println("State 3 : " + t.getState());   //Blocked/waiting
            try {
                t.join();   //Wait for thread to finish
            } catch (Exception e) {

            }
            System.out.println("State 4: " + t.getState());   //Terminated

        }
    }
}