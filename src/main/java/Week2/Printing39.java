package Week2;

public class Printing39 {
    public static void main(String[] args) {
        xmasTree(6);
    }

    private static void xmasTree (int size) {
        int counter = 0;
        int copyOfSize = size;
        int secondCounter = 1;
        while (counter < size) {
            counter++;
            printWhiteSpaces(copyOfSize--);
            printStars(secondCounter);
            System.out.println();
            secondCounter=secondCounter + 2;
        }
        if(counter == size){
            printWhiteSpaces(size-1);
            printStars(3);
            System.out.println();
            printWhiteSpaces(size-1);
            printStars(3);
        }

    }

    private static void printWhiteSpaces (int size) {
        int counter = 0;
        while (counter < size) {
            System.out.print(" ");
            counter++;
        }
    }

    private static void printTriangle(int size) {
        int counter = 0;
        int copyOfSize = size;
        while (counter < size) {
            counter++;
            printWhiteSpaces(copyOfSize--);
            printStars(counter);
            System.out.println();
        }
    }

    private static void printRectangle(int width, int height) {
        int counter = 0;
        while (counter < height) {
            printStars(width);
            counter++;
            System.out.println();
        }
    }

    private static void printSquare(int sideSize) {
        int counter = 0;

        while (counter < sideSize) {
            printStars(sideSize);
            System.out.println();
            counter++;
        }
    }


    private static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter++;
        }
    }
}
