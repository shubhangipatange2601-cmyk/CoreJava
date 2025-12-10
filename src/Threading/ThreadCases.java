package Threading;

//Performing single task from single thread

public class ThreadCases extends Thread {
    public void run(){
        System.out.println("task 1");
    }

    public static void main(String[] args) {
        ThreadCases tc = new ThreadCases();
        tc.start();
    }

}
