// LinearSearch


public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5, 8, 3};
        int search = 9;
        boolean found = false;

        for (int x : arr) {
            if (x == search) {
                found = true;
                break;
            }
        }
    }
}
