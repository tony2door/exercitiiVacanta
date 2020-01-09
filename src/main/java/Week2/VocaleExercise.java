package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class VocaleExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> cuvinte = new ArrayList<String>();
        cuvinte.add("barza");
        cuvinte.add("barzaune");
        cuvinte.add("boxe");
        cuvinte.add("mouse");
        cuvinte.add("lampa");
        ArrayList<Character> vocale = new ArrayList<Character>();
        vocale.add('a');
        vocale.add('e');
        vocale.add('i');
        vocale.add('o');
        vocale.add('u');
        int counter = 0;
        ArrayList<Character> allLetters = new ArrayList<Character>();

        for (int i = 0; i < cuvinte.size(); i++) { // pentru fiecare litera din cuvantu b a r z a
            for (int j = 0; j < cuvinte.get(i).length(); j++) {
                allLetters.add(cuvinte.get(i).charAt(j));
            }
        }
        for (int i = 0; i < allLetters.size(); i++) {
            for (int j = 0; j < vocale.size(); j++) {
                if (vocale.get(j) == allLetters.get(i)) {
                    counter++;
                }
            }
        }
        System.out.println(cuvinte + "vocale: " + counter);
    }
}
