import java.util.*;
public class Sum{
    static int Table(int start, int end){
        int res = 0;
        for(int i = start; i<= end; i++){
            if(i % 2 == 0){
                res += i;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        // int res = Table(start, end);
        System.out.println(Table(start, end));
    }
}

