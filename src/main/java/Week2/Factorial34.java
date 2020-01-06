package Week2;

import java.util.Scanner;

public class Factorial34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = Integer.parseInt(String.valueOf(reader.nextInt()));
        int counter = 0;
        int product=1;
        while (counter < factorial){
            counter++;
            product = counter * product;
        }
        System.out.println(product);
    }
}
