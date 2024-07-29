public class Smallest {


        public static void main(String[] args) {

            int[] array = { 10, 4, 7, 1, 3, 9, 2 };
            int min = array[0];
    
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("The smallest element in the array is: " + min);
        }
    }
    

