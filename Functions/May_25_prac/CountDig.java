import java.util.*;
public class CountDig{
    static int countDigits(int n){
        n = Math.abs(n);
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(countDigits(number));
    }
}

