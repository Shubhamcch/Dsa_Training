import java.util.*;
public class Function{
    static void Area(int r){
        System.out.println(3 * r * r);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Area(r);
    }
}