// Subtracting 2 arrays by converting to numbers

public class ArraySub{
    public static int[] subtract(int[] a, int[] b) {

        int num1 = 0;
        for (int i = 0; i < a.length; i++) {
            num1 = num1 * 10 + a[i];
        }
        int num2 = 0;
        for (int i = 0; i < b.length; i++) {
            num2 = num2 * 10 + b[i];
        }

        int sub = num1 - num2;
        if (sub == 0) {
            return new int[]{0};
        }
        int temp = sub;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] res = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            res[i] = sub % 10;
            sub /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 4, 0, 2, 8};
        int[] b = {9, 2, 5, 2, 1, 7};
        int[] result = subtract(a, b);

        for (int digit : result) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
