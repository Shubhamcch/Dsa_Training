import java.util.*;
public class Vowel{
    static boolean isVowel(char ch){
        boolean isVowel = false;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            isVowel = true;
        }
        return isVowel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(isVowel(c));
    }
}