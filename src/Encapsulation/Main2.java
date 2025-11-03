package Encapsulation;
class Person{
    //step 1: Make variables private (data hiding)
    private String name;
    private int age;

    //Provide public methods to set and get the values
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;

    }
    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;

    }
}

public class Main2 {
    public static void main(String[] args) {
        //step 3 : Create object and use methods to access data
        Person p = new Person();
        p.setName(" Shubhangi");
        p.setAge(29);


        System.out.println("Name; " + p.getName());
        System.out.println("Age: " + p.getAge());

    }
}
