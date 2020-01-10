package Week3;

import java.util.Scanner;

public class LengthOfAName47 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: ");
        System.out.println(calculateCharacters(reader.nextLine()));

    }
    public static int calculateCharacters(String text){
        int noOfCharacters = text.length();
        return noOfCharacters;
    }
}
