package Week2;

import java.util.Scanner;

public class UpToWhatNumber30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(String.valueOf(reader.nextInt()));
        int x = 0;
        while(x<number){
                x=x+1;
                System.out.println(x);
            }
        }
    }
