package Week1;

import java.util.Scanner;
//Exercise 23.2: Checking
//Improve your program so that temperatures below -30 degrees or over +40 degrees are ignored and not added to the graph.
public class Temperatures23 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean mergeProgramul = true;
        while(mergeProgramul) {
            System.out.println("Add temperature: || type 404 to exit");
            Double number = Double.parseDouble(reader.nextLine());
            if (number > -30 && number < 40) {
                Graph.addNumber(number);
            }
            else if (number == 404){
                mergeProgramul = false;
                System.exit(1);
            }
            else {
                System.out.println("Add a number between -29 and 39!");
            }
        }
    }
}
