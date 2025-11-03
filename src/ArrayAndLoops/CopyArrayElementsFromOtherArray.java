package ArrayAndLoops;

public class CopyArrayElementsFromOtherArray {


        public static void main(String[] args) {
            int[] array = {3,2,6,9,10,1,4,8,5,7};
            //3 2 6 9 10 1 4 8 5 7  value
            //0 1 2 3  4 5 6 7 8 9  index

            int[] dummy = new int[array.length]; //

            for(int i = 0; i < array.length; i++){
                //i = 0  array[0] = 3   array[1] = 2
                //i = 5
                dummy[i] = array[i];
                //dummy[0] = 3
                //dummy[1] = 2
                //dummy[5] = 1
            }

            for(int j=0; j < dummy.length; j++){
                System.out.println("Elements in copied array are "+dummy[j]);
            }
        }
    }


