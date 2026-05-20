import java.util.*;
public class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int upto = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 1; i<= upto; i++){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}