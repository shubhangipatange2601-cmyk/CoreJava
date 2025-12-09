package ExceptionHandling;

public class PrintStackTrace {
        //1) PrintStackTrace()
        public static void main(String[] args) {
            try {
                int a = 10 / 0;
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

