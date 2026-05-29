public class Short{
    public static int calculate(int[] arr){
        int prev = -1;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0 && arr[i] % 2 == 0){
                count++;
                if(prev != -1){
                    min = Math.min(min, i - prev);
                }
                prev = i;
            }
            
        }
            if(count <= 1){
                return -1;
            }
            return min;
    }
    public static void main(String[] args){
        int arr[] = {2,6,10,3,25};
        System.out.println(calculate(arr));
    }
}