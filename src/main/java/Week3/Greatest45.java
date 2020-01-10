package Week3;

public class Greatest45 {
    public static void main(String[] args) {

        int answer = greatest(2,3,4);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        int greatest = 0;
        if (number1 > number2 && number1 > number3) {
            greatest = number1;
        } else if (number1 < number2 && number2 > number3) {
            greatest = number2;
        } else if (number3 > number1 && number3 > number2){
            greatest = number3;
        } else {
            greatest = number1;
            System.out.println("The numbers are equal!");
        }
        return greatest;
    }
}