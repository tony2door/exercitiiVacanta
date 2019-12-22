package Week1;

import java.util.Scanner;

public class GradesAndPoints18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int points = in.nextInt();
        if (points >= 0 && points <= 29){
            System.out.println("Failed");
        }
        else if (points >= 30 && points <= 34){
            System.out.println("grade 1");
        }
        else if (points >= 35 && points <= 39){
            System.out.println("grade 2");
        }
        else if (points >= 40 && points <= 44){
            System.out.println("grade 3");
        }
        else if (points >= 45 && points <= 49){
            System.out.println("grade 4");
        }
        else if (points >= 50 && points <= 60){
            System.out.println("grade 5");
        }
        else {
            System.out.println("type in a number between 0 and 60!");
        }
    }
}
