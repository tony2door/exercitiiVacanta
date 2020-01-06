package Week2;

public class Printing39 {
    public static void main(String[] args) {
        printStars(5);
    }


    private static void printStars (int amount){
        int counter = 0;
        while (counter < amount){
            System.out.print("*");
            counter++;
        }
    }
}
