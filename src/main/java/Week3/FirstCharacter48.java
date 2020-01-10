package Week3;

import java.util.Scanner;

public class FirstCharacter48 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a word: ");
        System.out.println("first character is" + firstCharacter(reader.nextLine()));
    }
    public static char firstCharacter(String text){
        char firstChar = text.charAt(0);
        return firstChar;
    }
}
