public class Strong{
    static boolean isStrong(int n) {
        int sum = 0, temp = n;

        while (temp > 0) {
            int d = temp % 10, fact = 1;

            for (int i = 1; i <= d; i++)
                fact *= i;

            sum += fact;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
}