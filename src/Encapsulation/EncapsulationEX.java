package Encapsulation;

    class Student {
    // Private data members (data hiding)
    private String name;
    private int age;

    // Public setter method
    public void setName(String n) {
        name = n;
    }

    // Public getter method
    public String getName() {
        return name;
    }

    // Public setter method
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Public getter method
    public int getAge() {
        return age;
    }
}

public class EncapsulationEX {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shubhangi");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
