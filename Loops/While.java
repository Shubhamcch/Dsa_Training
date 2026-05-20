import java.util.*;
public class While{
    public static void main(String[] args){
        // int minute = 0;
        // int charge = 10;
        // while(charge < 100){
        //     minute++;
        //     charge += 10;
        // }
        // System.out.println(minute);
        // System.out.println(charge);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        while(n > 0){
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}