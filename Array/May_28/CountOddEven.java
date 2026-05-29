// Count Odd and Even


public class CountOddEven{
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5, 8, 3};
        int odd = 0, even = 0;

        for (int x : arr) {
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Odd Count: " + odd + ", Even Count: " + even);
    }
}
