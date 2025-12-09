package ExceptionHandling;

public class RuntimeException {
    RuntimeException (String msg){
        super();
    }
        public static void main(String[] args) {
            //FileInputStream fis = new FileInputStream("d:/abc.txt");  //Compiler checked this exception called as checked  or compile time exception
            //Class.forName("com.mysql.jdbc.Driver");

       /* int a = 100, b=0, c;  //compiler does not check this exception thats why that is called Unchecked or Runtime time exception.
        c = a/b;
        System.out.println(c);


        */
            String name=null;
            System.out.println(name.length());
        }
    }


