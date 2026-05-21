public class DigitSum{
    public int Vote(int age){
        if(age<18){
            System.out.println("You Are Kid");
        }
        else{
            System.out.println("You can Vote");
        }
    }
    public static void main(String[] args){
        Vote(age:20);
    }
}