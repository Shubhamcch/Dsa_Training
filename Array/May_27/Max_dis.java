public class Max_dis{
    public static int maxDistance(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1; j > i; j--){
                if (arr[i] == arr[j]){
                    max = Math.max(max, j - i);
                    break;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 1, 4, 2, 1};
        System.out.println(maxDistance(arr));
    }
}