package Encapsulation;

class car{
    String brand;
    int speed;

    void setDetails(String b,int s){
        brand = b;
        speed = s;

    }
    void printDetails(){
        System.out.println("Brand : "+brand);
        System.out.println("Speed :"+speed);
    }
}

public class MainApp1 {
    public static void main(String[] args) {
        car c = new car();
        c.setDetails("Tata", 100 );
        c.printDetails();
    }
}
