// Sum of array Except itself

public class sumOfArray{
    public static int[] calculate(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] = sum - arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,4,7,5,4,9,25};
        System.out.println(calculate(arr));
    }
}
