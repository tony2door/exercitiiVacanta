package Week1;

import java.util.Scanner;

public class Usernames20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type in the username");
        String username = in.nextLine();
        System.out.println("type in the password");
        String password = in.nextLine();

        String actualUsername = "tony";
        String actualPassword = "1234";

        String actualUsername1 = "emily";
        String actualPassword1 = "cat";

        if ((username.equalsIgnoreCase(actualUsername) && password.equalsIgnoreCase(actualPassword)
                || ((username.equalsIgnoreCase(actualUsername1) && password.equalsIgnoreCase(actualPassword1))))) {
            System.out.println("you are now logged into the system");
        } else {
            System.out.println("invalid username or password");
        }
    }
}
