package Week1;

import java.util.Scanner;

public class AgeCheck19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how old are you");
        int x = in.nextInt();
        if (x < 0 || x > 120){
            System.out.println("hell naw");
        }
        else {
            System.out.println("ok");
        }
    }
}
