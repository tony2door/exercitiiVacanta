package Week2;

import java.util.Scanner;

public class ReadingNumber36p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int counter = 0;

        while (true) {
            System.out.println("Type the numbers: ");
            int userNumber = in.nextInt();
            if (userNumber == (-1)) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                sum = sum + userNumber;
                counter++;
            } if (userNumber % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            System.out.println(userNumber);
        }
        double average = ((double) sum / counter);
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
