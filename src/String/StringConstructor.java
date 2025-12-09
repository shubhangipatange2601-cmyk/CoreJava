package String;

public class StringConstructor {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("deepak");
        String s2 = new String(sb);
        System.out.println(s2);
    }



    }

//why character array is preferred over string for storing passwords?