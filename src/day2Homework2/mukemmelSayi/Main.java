package day2Homework2.mukemmelSayi;

public class Main {
    public static void main(String[] args) {
        checker(0);
    }

    static boolean checker(int number) {
        int sum = 0;
        if(!(number<=0)){
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    sum += i;
            }
            if (sum == number)
                System.out.println(" Perfect Number " + number);
            else {
                System.out.println(" Perfect değil " + number);
            }
        }
        else{
            System.out.println("Geçersiz sayı");
        }
        return true;
    }
}
