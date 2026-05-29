// Largest Element in an array


public class LargestElement{
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5, 8, 3};
        int largest = arr[0];

        for (int x : arr) {
            if (x > largest) {
                largest = x;
            }
        }
        System.out.println("Largest Element: " + largest);
    }
}
