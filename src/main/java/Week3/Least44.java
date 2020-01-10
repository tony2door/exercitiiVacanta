package Week3;

public class Least44 {
    public static void main(String[] args) {
        int answer = least(2,3);
        System.out.println("Least: " + answer);
    }

    public static int least(int number1, int number2) {

        int least = 0;
        if (number1 > number2) {
            least = number2;
        } else if (number1 < number2) {
            least = number1;
        } else {
            least = number1;
            System.out.println("The numbers are equal!");
        }
        return least;
    }
}
