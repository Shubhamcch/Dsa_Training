// Write a program to count all elements in array less than X.

public class count_less{
    public static int calculate(int[] arr, int k){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,4,7,5,4,9,25};
        int k = 5;
        System.out.println(calculate(arr,k));
    }
}
