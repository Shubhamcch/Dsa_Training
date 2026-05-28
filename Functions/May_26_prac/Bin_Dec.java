public class Bin_Dec{
    static int convert(int n){
        if(n == 0) return 0;
        int res = 0;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            res += (rem * (Math.pow(2,count)));
            count++;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(convert(10010));
    }
}