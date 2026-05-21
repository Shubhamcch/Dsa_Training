import java.util.*;
public class Rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while(m > 0){
            int digit = m % 10;
            rev = rev * 10 + digit;
            m /= 10;
        }
        if( rev == n){
            System.out.println("Is is Plaindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}