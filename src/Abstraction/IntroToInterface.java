package Abstraction;

public class IntroToInterface implements AA,BB,CC{
    @Override
    public void show() {
    }
}

interface CC{

}

interface AA{
    abstract void show();   //by default methods in interface are abstract.
}

interface BB extends AA,CC {

}