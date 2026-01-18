package Java8;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SHUBHU");



        List anotherList= new ArrayList();
        anotherList.add("SHUBHU");
        anotherList.add(12455);
        anotherList.add(12.566);
        anotherList.add("B");

        System.out.println(list);
        System.out.println(anotherList);
    }
}
