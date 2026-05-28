import java.util.*;
public class Fun1{
    static void Table(int r){
        for(int i = 1; i<= 10; i++){
            System.out.println("r * i = "r * i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Table(r);
    }
}