import java.util.*;
public class Short_dis{
    public static int distance(int[] arr){
        int prev = -1;
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0){
                count++;
                if (prev != -1) {
                    min = Math.min(min, i - prev);
                }
                prev = i;
            }
        }
        if (count <= 1) {
            return -1;
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 7, 8, 3, 10};
        System.out.println(distance(arr));
    }
}