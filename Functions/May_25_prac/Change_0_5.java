import java.util.*;

public class Change_0_5 {
    static int swapZeroFive(int num) {
        if (num == 0) {
            return 5;
        }
        int result = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                digit = 5;
            } else if (digit == 5) {
                digit = 0;
            }
            result += digit * place;
            place *= 10;
            n /= 10;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(swapZeroFive(num));
    }
}

