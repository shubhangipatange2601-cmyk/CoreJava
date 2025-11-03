package BasicJava;

public class AccessMethodsUsingObj {

        int age = 100;
        String name = "Java";

        int addition(int a, int b) {
            int c = a + b;
            return c;
        }

        void show() {
            System.out.println("show Method");
        }

        void test() {
            System.out.println("Test method of a class");
        }

        public static void main(String[] args) {
            AccessMethodsUsingObj obj = new AccessMethodsUsingObj();

            //syntax(2)
            // Syntax for accessing Variables or Methods
            // referenceName.VariableName;
            // int a = obj.age
            System.out.println("Access variable a Using object "+obj.age);
            System.out.println("Access name variable using object"+obj.name);


             //Syntax(3)
            //Syntax for accessing method
            //referenceName.MethodName;
            obj.test();
            obj.show();
        }
    }

