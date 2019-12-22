package Week1;

import java.util.Scanner;

public class GreaterNumber17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type the first number");
        int num = in.nextInt();
        System.out.println("type in the second number");
        int num2 = in.nextInt();
        if(num > num2){
            System.out.println(num + " is the greater number");
        }
        else if (num == num2){
            System.out.println("numbers are equal!");
        }
        else{
            System.out.println(num2 + " is the greater number");
        }
    }
}
