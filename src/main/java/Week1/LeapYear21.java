package Week1;

import java.util.Scanner;

public class LeapYear21 {
    public static void main(String[] args) {
        int an;
        int x=4;
        int y=400;
        int z=100;

        Scanner in = new Scanner(System.in);
        System.out.print("Type a year ");
        an = in.nextInt();

        if((an%x==0) && (an%y==0)) {
            System.out.println("The year is not a leap year");
        }
        else if((an%x==0) || (an%z==0)) {
            System.out.println("The year is a leap year");
        }
        else {
            System.out.println("The year is not a leap year");
        }
    }
}
