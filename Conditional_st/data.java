public class Data{
    public static void main(String[] args){
        //  final byte a = 10;
        //  final byte b = 20;
        //  byte c = a + b;
        //  System.out.println(c);

        // int a = 5;
        // int b = 10;
        // String c = b > a ? "10 is greater ":"5 is grater";
        // System.out.println(c);

        // int a = 5;
        // int b = 10;
        // int c = 15;
        // int d = (a > b && a > c) ? a:(b > a && b>c) ? a:c;
        // System.out.println(d);

        // int age = 21;
        // String c = age > 18 ? "vote dedeeeeeee" : "vote mat de";
        // System.out.println(c);

        int a = 5;
        int b = 10;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(a++);
        System.out.println(b++);

        int c = 1;
        int d = c++ + ++c + c++ +c;
        System.out.println(d);

        int e = 5;
        System.out.println(e++ + ++e * e++);
    }
}

