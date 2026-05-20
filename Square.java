import java.util.*;
public class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n > 0){
            int digit = n % 10;
            ans += digit * digit;
            n /= 10;
        }
        System.out.println(ans);
    }
}