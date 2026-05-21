import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "True";
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                ans = "False";
                break;
            }
        }
        System.out.println(ans);
    }
}