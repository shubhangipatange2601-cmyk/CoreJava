package Threading;

public class MtDemo extends Thread {
   public void run(){
       System.out.println("Thread class ");
    }
    public static void main(String[] args) {
       MtDemo m = new MtDemo();
       m.start();
   }
}
