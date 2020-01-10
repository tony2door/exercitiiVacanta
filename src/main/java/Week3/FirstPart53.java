package Week3;

import java.util.Scanner;

public class FirstPart53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word ");
        String word = reader.nextLine();
        System.out.println("Length ");
        int length = Integer.parseInt(String.valueOf(reader.nextInt()));
        System.out.println(word.substring(0,length));
    }
}
