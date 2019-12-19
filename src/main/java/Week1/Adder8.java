package Week1;

import java.util.Scanner;

public class Adder8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type in first number");
        int var = in.nextInt();
        System.out.println("type in second number");
        int var1 = in.nextInt();
        System.out.println("Sum of numbers is " + (var + var1));
    }
}
