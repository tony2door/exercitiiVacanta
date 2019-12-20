package Week1;

import java.util.Scanner;

public class BiggerNumber11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("add first number");
        int number = in.nextInt();
        System.out.println("add second number");
        int number1 = in.nextInt();
        System.out.println("The bigger number is " + Math.max(number,number1));
    }
}
