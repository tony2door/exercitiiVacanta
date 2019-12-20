package Week1;

import java.util.Scanner;

public class Circumference10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        double pi = Math.PI *2;
        double circumference = pi *radius;
        System.out.println("Circumference " + circumference);
    }
}
