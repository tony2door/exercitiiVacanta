package Week1;

import java.util.Scanner;

public class Password21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String actualPassword = "dolar";

        while(true){
            System.out.println("Type the password ");
            String password = in.nextLine();
            if (password.equals(actualPassword)){
                System.out.println("Right!");
                System.out.println("Secret message is: bani");
                break;
            }
            else {
                System.out.println("wrong!");
            }
        }
    }
}
