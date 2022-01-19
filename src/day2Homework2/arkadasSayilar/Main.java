package day2Homework2.arkadasSayilar;

public class Main {
    public static void main(String[] args) {
        checkFriends(220, 284);
    }

    static boolean checkFriends(int number1, int number2) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                sum2 += i;
            }
        }
        if (number1 == sum2 && number2 == sum1) {
            System.out.println("They are friends");
        } else {
            System.out.println("They are not friends");
        }
        return true;
    }
}
