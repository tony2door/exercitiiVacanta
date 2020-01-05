package Week2;

import java.util.Scanner;

public class SumOfSet32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("until what number?");
        int number = Integer.parseInt(String.valueOf(reader.nextInt()));
        int count = 0;
        int sum = 0;
        while (count < number){
            count++;
            sum = sum + count;
        }
        System.out.println(sum);
    }
}
