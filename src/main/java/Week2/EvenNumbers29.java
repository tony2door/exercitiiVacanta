package Week2;

public class EvenNumbers29 {
    public static void main(String[] args) {
        int number = 1;
        while (number>0 && number <100){
            number++;
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
