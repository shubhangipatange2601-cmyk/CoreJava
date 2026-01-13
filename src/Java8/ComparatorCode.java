package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeDetails{
    int id;
    String name;
    double salary;

    public EmployeeDetails(){}

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ComparatorCode {
    public static void main(String[] args) {
        EmployeeDetails Shamu = new EmployeeDetails(100,"Shamu",90000);
        EmployeeDetails saru = new EmployeeDetails(102,"saru",90500);
        EmployeeDetails shivam = new EmployeeDetails(103,"shivam",100000);
        EmployeeDetails Gaurav = new EmployeeDetails(104,"Gaurav",150000);


        List<EmployeeDetails>employeeDetailsList= new ArrayList<>();

        employeeDetailsList.add(Shamu);
        employeeDetailsList.add(saru);
        employeeDetailsList.add(shivam);
        employeeDetailsList.add(Gaurav);

        Comparator<EmployeeDetails>employeeDetailsComparator = new Comparator<Java8.EmployeeDetails>() {
            @Override
            public int compare(EmployeeDetails o1,EmployeeDetails o2) {
                return o1.getId() - o2.getId();
            }
        };

        System.out.println("Before Sorting "+employeeDetailsList);

        Collections.sort(employeeDetailsList,employeeDetailsComparator);

        Collections.sort(employeeDetailsList,employeeDetailsComparator);

        System.out.println("After sorting " + employeeDetailsList);







    }
}
