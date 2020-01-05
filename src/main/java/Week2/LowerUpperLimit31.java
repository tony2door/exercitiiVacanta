package Week2;

import java.util.Scanner;

public class LowerUpperLimit31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(String.valueOf(reader.nextInt()));
        int number2 = Integer.parseInt(String.valueOf(reader.nextInt()));
        while(number < number2 || number2 < number){
            if(number < number2) {
                int x = number++;
                System.out.println(x);
            }
            else {
                int y = number2++;
                System.out.println(y);
            }
        }
    }
}
