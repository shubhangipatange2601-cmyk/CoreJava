package Java8;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List <Integer> integers = List.of(14,2343,6545,768567);
        System.out.println(integers);

        integers.stream().forEach(e ->{
            System.out.println(e);
        });

                     // or

      //  integers.stream().forEach(System.out::println);

    }

}
