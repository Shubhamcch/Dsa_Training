import java.util.*;
public class Cel_Fah{
    static double Celsius(float c) {
        double result = (c * 9.0 / 5.0) + 32;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.println(Celsius(c));
    }
}