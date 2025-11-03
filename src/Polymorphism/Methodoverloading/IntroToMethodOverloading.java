package Polymorphism.Methodoverloading;

public class IntroToMethodOverloading {

    int add(int a, int b){
        return a+b;
    }

    int add (int a, int b,short c){
        return a+b+c;
    }

    long add(int a,int l,int z){
        return a+l+z;
    }

    void show(int a,String b){

    }

    private void show (String aaa,int mmmm){

    }
}
