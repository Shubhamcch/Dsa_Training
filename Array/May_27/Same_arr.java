import java.util.*;

public class Same_arr{
    public static int[] sumArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};

        int[] ans = sumArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}