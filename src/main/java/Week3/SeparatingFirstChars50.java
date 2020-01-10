package Week3;

import java.util.Scanner;

public class SeparatingFirstChars50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a word: ");
        String word = reader.nextLine();
        int counter = 1;

        for (int i = 0; i < 3; i++) {
            if(word.length() < 3){
                break;
            }
            else {
                System.out.println(counter + ". " + word.charAt(i));
                counter++;
            }
        }
    }
}
