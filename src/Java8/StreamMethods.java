package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //filter(Predicate)
        //boolean value function
        //e->{return true/false} or e->e>10



        //map(Function)
        /*
        each element operation

         */

        List<String> names = List.of("Shubhangi", "Sarita", "Shivmangal", "Gaurav", "Shivam");
       List<String> newNames = names.stream().filter(e ->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);


        List<Integer> numbers = List.of(23,4,2,7,4);
        List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

    }
}
