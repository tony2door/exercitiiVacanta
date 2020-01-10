package Week2;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame41 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int randomNumber = new Random().nextInt(101);
        int counter = 0;
        System.out.println("Guess a number: ");
        int userNumber = in.nextInt();

        while (randomNumber != userNumber) {
            counter++;
            if (userNumber > randomNumber) {
                System.out.println("The number is lesser, guesses made: " + counter);
                userNumber = in.nextInt();
            } else {
                System.out.println("The number is greater, guesses made: " + counter);
                userNumber = in.nextInt();
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }
}