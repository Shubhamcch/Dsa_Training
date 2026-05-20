import java.util.*;
public class CheckPower{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = sc.nextInt();
        if(m == 1) if(n == 1) return 1;
        while(max % min == 0){
            max /= min;
        }
        if(max == 1) System.out.println("True");
        else System.out.println("False");
    }
}