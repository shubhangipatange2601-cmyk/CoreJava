package BasicJava;

public class CreatingObjects {

        int age = 100;
        String name = "Java";


        int addition(int a,int b){
            int c = a+b;
            return c;
        }


        public static void main(String[] args) {
            //syntax for creating an object of the class.
            //className referenceName/identifier = new className();


            CreatingObjects object1 = new CreatingObjects();     //Creating an object of class

            CreatingObjects object2 = new CreatingObjects();


            class Test{
                public static void main(String[] args) {
                    Test obj = new Test();

                }

            }
        }

    }



