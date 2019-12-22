package Week1;

import java.util.Scanner;

public class OddNumber16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type a number");
        int x = in.nextInt();
        if(x/2==0){
            System.out.println(x + " is an even number");
        }
        else if (x==0) {
            System.out.println("type a number other than 0 ");
        }
        else {
            System.out.println(x + " is not odd");
        }
    }
}
