import java.util.*;

public class Sub_arr{
    public static int[] subtractArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr1 = {5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4};

        int[] ans = subtractArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
