public class Dec_Bin{
    static int convert(int n){
        if(n == 0) return 0;
        int rev = 0;
        int tense = 1;
        while(n > 0){
            int rem = n % 2;
            rev = rev + tense * rem;
            tense *= 10;
            n /= 2;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(convert(4));
    }
}