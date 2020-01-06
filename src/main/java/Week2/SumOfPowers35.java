package Week2;

import java.util.Scanner;

public class SumOfPowers35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int power = Integer.parseInt(String.valueOf(reader.nextInt()));
        int counter = 0;
        int total = 0;
        while (counter <= power){
            total = (int) (Math.pow(2,counter) + total);
            counter++;
        }
        System.out.println(total);
    }
}
