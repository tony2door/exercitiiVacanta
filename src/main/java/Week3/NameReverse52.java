package Week3;

import java.util.Scanner;

public class NameReverse52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a word: ");
        String word = reader.nextLine();
        System.out.print("In reverse order: ");

        for (int i = word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
