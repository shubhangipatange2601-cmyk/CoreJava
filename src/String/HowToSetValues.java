package String;

public class HowToSetValues {
    private String name;
    private int age;
    private double salary;
    private String address;

    public HowToSetValues(){}


    public HowToSetValues(String name1, int age1, double salary1, String address1){
        this.name = name1;
        this.age = age1;
        this.salary = salary1;
        this.address = address1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        HowToSetValues obj1 = new HowToSetValues("Java", 36,300000,"Pune");

        HowToSetValues obj2 = new HowToSetValues("shubhangi", 28,8000000,"USA");

        HowToSetValues obj3 = new HowToSetValues();
        obj3.setName("J");
        obj3.setAge(35);
        obj3.setSalary(99);
        obj3.setAddress("Add");

        obj3.setAddress("change Address");   //Modify the object state

        String s = "Java";
        s = s.concat("Program");  //modify

        //Mutable vs Immutable
        //In case of mutable object, when we modify of an object we are modifying the same object
       // and not creating any new object.

        //In case of immutable object,when we modify the state of an object, we can not modify the object once it is created and even
        //we try to modity the object it will create a new object and original object will remain as it is.


    }

}
