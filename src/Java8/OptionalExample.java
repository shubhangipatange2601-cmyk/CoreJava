package Java8;

import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getName(){
        String name = "Durgesh";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        String str = null;
        if(str==null) {
            System.out.println("this is null object");
        }else{
            System.out.println(str.length());

        }







































        String str1 = "Java is my favourite";
        Optional <String> optional = Optional.ofNullable(str1);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        System.out.println(optional.orElse("No value in this Object"));

     Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("null return"));

    }
}
