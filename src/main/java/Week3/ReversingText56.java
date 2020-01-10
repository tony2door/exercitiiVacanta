package Week3;

import java.util.Scanner;

public class ReversingText56 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String text) {
        StringBuilder newstring = new StringBuilder();
        for(int i = text.length()-1; i>=0; i--){
            newstring.append(text.charAt(i));
        }
        return newstring.toString();
    }
}
