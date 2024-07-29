public class Largest {

    public static void main(String[] args) {
        int[] array = { 10, 4, 7, 1, 3, 9, 2 };
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
