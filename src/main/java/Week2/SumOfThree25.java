package Week2;

import java.util.Scanner;

public class SumOfThree25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.println("type the first number");
        read = Integer.parseInt(String.valueOf(reader.nextInt()));
        sum = read;
        System.out.println("type the second number");
        read = Integer.parseInt(String.valueOf(reader.nextInt()));
        sum = sum + read;
        System.out.println("type the third number");
        read = Integer.parseInt(String.valueOf(reader.nextInt()));
        sum = sum + read;
// WRITE YOUR PROGRAM HERE
// USE ONLY THE VARIABLES sum, reader AND read!
        System.out.println("Sum: " + sum);
    }
}
