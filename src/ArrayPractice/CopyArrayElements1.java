package ArrayPractice;

public class CopyArrayElements1 {
    public static void main(String[] args) {
        int[]array = {20,30,50,40,70,60,80,90,100,10};

        int[]copy = new int[array.length];
        for(int i = 0; i < array.length; i++){
        copy[i] = array[i];

        }
       for(int j = 0; j<copy.length; j++){
           System.out.println("elements in copied array are " + copy[j]);
       }



    }

    }