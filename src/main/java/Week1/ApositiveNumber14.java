package Week1;

import java.util.Scanner;

public class ApositiveNumber14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type a number: ");
        int num = in.nextInt();
        if(num > 0){
            System.out.println(num + " is positive");
        }
        else if (num == 0){
            System.out.println(num + " is 0");
        }
        else {
            System.out.println(num + " is negative");
        }
    }
}
