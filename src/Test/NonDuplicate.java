package Test;
public class NonDuplicate {
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 4, 4, 5};
            System.out.println("Nonduplicate elements:");

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;

                // Check if this element has appeared elsewhere in the array
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                // Print if not a duplicate
                if (!isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

