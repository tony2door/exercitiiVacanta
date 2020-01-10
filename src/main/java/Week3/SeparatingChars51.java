package Week3;

import java.util.Scanner;

public class SeparatingChars51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a word: ");
        String word = reader.nextLine();
        int counter = 1;

        for (int i = 0; i < word.length(); i++) {
                System.out.println(counter + ". " + word.charAt(i));
                counter++;
        }
    }
}
