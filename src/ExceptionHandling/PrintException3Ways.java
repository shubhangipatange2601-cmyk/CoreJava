package ExceptionHandling;

public class PrintException3Ways {
        public static void main(String[] args) {
            try {
                int a = 10 / 0;
            } catch (Exception e){
                System.out.println("1 Using getMessage():");
                System.out.println(e.getMessage());     //print only message

                System.out.println("\n2 Using toString():");
                System.out.println(e.toString());        //prints class + message

                System.out.println("\n3) Using printStackTrace():");
                e.printStackTrace();                    //Prints full details

            }

        }
    }

