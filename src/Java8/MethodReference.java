package Java8;

public class MethodReference {
    public static void main(String[] args) {
        System.out.println("Learning Method References..");

        //Provide the implementation of WorkInter
        /*WorkInter workInter = () ->{
            System.out.println("This is do task  new method ");
        };*/
                //or

        //Referring static method
        //ClassName::methodName

        WorkInter workInter = Stuff::doStuff;
        workInter.doTask();

        Runnable runnable = Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();

        //Referring non-static methods
        //Object::methodName

        Stuff ob = new Stuff();
        Runnable runnable1 = ob::printNumber;

        Thread d1 = new Thread(runnable1);
        d1.start();

    }
}
