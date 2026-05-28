public class Bin_Hex{
    static int convert(int n){
        if(n == 0) return 0;
        int res = 0;
        int rev = 0;
        int count = 0;
        int tense = 1;
        while(n > 0){
            int rem = n % 10;
            res += (rem * (Math.pow(2,count)));
            count++;
            n /= 10;
            if(count == 4){
                rev = rev * tense + res;
            }
            tense *= 10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(convert(00100100));
    }
}