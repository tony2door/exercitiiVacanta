package Week2;

import java.util.Scanner;

public class SumBetweenTwo33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first no");
        int number = Integer.parseInt(String.valueOf(reader.nextInt()));
        System.out.println("last no");
        int number2 = Integer.parseInt(String.valueOf(reader.nextInt()));
        int sum = 0;
        while (number <= number2){
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}
