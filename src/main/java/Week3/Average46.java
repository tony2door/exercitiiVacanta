package Week3;

public class Average46 {
    public static void main(String[] args) {
        double answer = average(8,1,2,3);
        System.out.println("Average: " + answer);
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double averageOfNumbers = (double) (number1 + number2 + number3 + number4) / 4;
        return averageOfNumbers;
    }
}
