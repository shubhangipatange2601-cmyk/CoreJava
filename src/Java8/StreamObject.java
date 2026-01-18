package Java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream API - Collection
        //Collection

        //1- blank
        Stream<Object> emptyStream = Stream.empty();

        //2 way - array,object,collection
        String names[] = {"Shubhangi","Sarita", "Gaurav","Shivam"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //3 builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();

        //4
     IntStream stream = Arrays.stream(new int[]{2,4,65,7,8});
     stream.forEach(e ->{
         System.out.println(e);
     });

     //5 List,Set

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(10);
        list2.add(23);
        list2.add(39);
        list2.add(13);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e ->{
            System.out.println(e);
        });

    }
}
