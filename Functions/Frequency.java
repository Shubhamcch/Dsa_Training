public class Frequency {
    static int countFreq(int n, int dig) {
        int count = 0;

        while (n > 0) {
            if (n % 10 == dig)
                count++;

            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFreq(122333, 3));
    }
}