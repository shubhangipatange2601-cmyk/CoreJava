package Constructor;

public class IntroToThisKeyword {
    IntroToThisKeyword(){
        System.out.println("No-arg Constructor ");
    }

    IntroToThisKeyword(int age,String name){
        System.out.println("2- arg Constructor ");
    }

    IntroToThisKeyword(int age,String name,boolean t){
        System.out.println("3-arg Constructor ");
    }

    public static void main(String[] args) {
        IntroToThisKeyword obj = new IntroToThisKeyword (100,"Java", true);

        IntroToThisKeyword obj1 = new IntroToThisKeyword(100,"Java");

        IntroToThisKeyword obj3 = new IntroToThisKeyword();
    }

}
