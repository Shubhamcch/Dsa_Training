import java.util.*;
public class Angstr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int ans = 0;
        while(m > 0){
            int digit = m % 10;
            ans += digit * digit * digit;
            m /= 10;
        }
        if(n == ans){
            System.out.println("It is Angrstrom");
        }
        else{
            System.out.println("Not Angstrom");
        }
    }
}