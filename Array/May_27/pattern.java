import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    int maxHeight = 0;
    for(int i = 0; i < arr.length; i++){
        maxHeight = Math.max(maxHeight, arr[i]);
    }
    for(int i = maxHeight; i >= 1; i--){
        for(int j = 0; j < n; j++){
            if(arr[j] >= i){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
  }
}
