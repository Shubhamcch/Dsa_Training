import java.util.Scanner;

public class NumGame{

    static void playGame() {
        Scanner sc = new Scanner(System.in);
        int secret = 50, guess;

        do {
            System.out.print("Enter number (1-100): ");
            guess = sc.nextInt();

            if (guess > secret)
                System.out.println("Too high");
            else if (guess < secret)
                System.out.println("Too low");

        } while (guess != secret);

        System.out.println("Correct Number!");
    }

    public static void main(String[] args) {
        playGame();
    }
}