package Week1;

public class SecondsInAYear {
    public static void main(String[] args) {
        int secondsInAMinute = 60;
        int secondsInAnHour = secondsInAMinute * 60;
        int secondsInADay = secondsInAnHour * 24;
        int x = secondsInADay * 365;
        System.out.println(x);
    }
}
