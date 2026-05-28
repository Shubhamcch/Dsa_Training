import java.util.*;
public class Last_Dig_Even{
    static boolean check(int a){
        boolean check = false;
        int count = 0;
        while(a > 0){
            int rem = a%10;
            count++;
            a /= 10;
            if( rem % 2 == 0 && count == 2){
                check = true;
            }
        }
        return check;
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(check(12235));
    }
}



