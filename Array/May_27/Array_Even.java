import java.util.*;
public class Array_Even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int [] arr = new int[m];
        for(int i=0; i<m; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        for(int i = 0; i<m; i++){
            if(arr[i] % 2 == 0 ){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
