package Week1;

import java.util.Scanner;

public class AgeOfMajority15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how old are you?");
        int age = in.nextInt();
        if (age >= 18){
            System.out.println("you have reached the age of the majority");
        }
        else {
            System.out.println("you have not reached the age of the majority yet");
        }
    }
}
