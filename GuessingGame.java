
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        int guess, answer, count = 1;
        String restart;

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number 1-100");

        System.out.print("Guess 1:");
        guess = scan.nextInt();
        
        answer = generator.nextInt(100) + 1;

        do {
            count++;

            if (guess == 0) {
                System.out.println("\nQuitting game");
                System.out.println("\nWould you like to play again? [1]Yes [0]No");
                restart = scan.next();
                if (restart.equalsIgnoreCase("Y")) {
                    System.out.print("Enter a number to start playing");
                    guess = scan.nextInt();
                } else {
                    break;
                }
            }
            if (guess == answer) {
                System.out.println("That's correct! You made " + count + " guesses.");
                System.out.println("Would you like to play again? Press any number to Quit");
                restart = scan.next();
                if (restart.equalsIgnoreCase("Y")) {
                    System.out.print("Enter a number to start playing");
                    guess = scan.nextInt();
                } else {
                    break;
                }
            }
            if (guess < answer) {
                System.out.println("Your guess is too low, try again.");
                System.out.println("Guess: "+ count);
                guess = scan.nextInt();
            }
            if (guess > answer) {
                System.out.println("Your guess is too high, try again.");
                guess = scan.nextInt();
            }
            if(count == 5){
                    System.out.println("You lose.");
                break;
            }

        } while (guess != 0);

        System.out.print("Thanks for playing!");
    }
}
