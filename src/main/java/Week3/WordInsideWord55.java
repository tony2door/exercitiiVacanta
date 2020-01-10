package Week3;

import java.util.Scanner;

public class WordInsideWord55 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First word ");
        String firstWord = reader.nextLine();
        System.out.println("Second word ");
        String secondWord = reader.nextLine();

        if(firstWord.indexOf(secondWord) > 0){
            System.out.println("the word " + secondWord + " is found in the word " + firstWord);
        }

//        if(firstWord.contains(secondWord)){
//            System.out.println("the word " + secondWord + " is found in the word " + firstWord);
//        }

//        for (int i = 0; i < firstWord.length(); ++i) {
//            if(firstWord.substring(i).equals(secondWord)){
//                System.out.println("the word " + secondWord + " is found in the word " + firstWord);
//            }
//        }
    }
}
