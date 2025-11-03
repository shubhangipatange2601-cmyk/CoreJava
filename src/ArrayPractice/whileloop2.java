package ArrayPractice;

public class whileloop2 {
    public static void main(String[] args) {
        int[]array = {3,4,5,6,8,9,10};
        //array length = 7
        int index = 0;
        while( index<array.length){
            System.out.println(" element present at index "+ index+"is"+ array[index] );
            index++;
        }
    }
}
