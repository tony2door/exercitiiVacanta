package Week2;

import java.util.Scanner;

public class PrintingOutText37and38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int timesPrinted = Integer.parseInt(String.valueOf(reader.nextInt()));
        int counter = 0;
        while (counter<timesPrinted) {
            counter++;
            printText();
        }
    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
