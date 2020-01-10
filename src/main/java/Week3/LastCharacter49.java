package Week3;

import java.util.Scanner;

public class LastCharacter49 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a word: ");
        System.out.println("last character is " + lastCharacter(reader.nextLine()));
    }
    public static char lastCharacter(String text){
        char lastChar = text.charAt(text.length()-1);
        return lastChar;
    }
}
