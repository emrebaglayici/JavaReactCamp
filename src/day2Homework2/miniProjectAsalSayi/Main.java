package day2Homework2.miniProjectAsalSayi;

public class Main {

    /*public static boolean primeNumberChecker(int primeNumber){
        if(primeNumber<=1)
            return false;
        else if(primeNumber==2)
            return true;
        else if(primeNumber%2==0)
            return false;
        for (int i = 3 ; i <=Math.sqrt(primeNumber); i+=2) {
            if(primeNumber%i==0)
                return false;
        }
        return true;

    }*/
    public static void main(String[] args) {
        /*if(primeNumberChecker(19))
            System.out.println("true");
        else
            System.out.println("false");*/
        /*int number=2;
        int remainder=number%2;
        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayı asal değildir");
            return;
        }

        if(number<1)
            System.out.println("Geçersiz sayı");
        for (int i = 2; i <number ; i++) {
            if (number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }*/
        /*isPrime(17);*/
        if(isPrime(17))
            System.out.println("Sayı asaldır");
        else
            System.out.println("Sayı asal değildir");
    }

    public static boolean isPrime(int primeNumber){

        if((primeNumber<=0)||(primeNumber<=1))
            System.out.println("Geçersiz bir sayı girdiniz");

        else if(primeNumber==2)
            System.out.println("Sayı asaldır : "+primeNumber);
        else{
            for (int i=2;i<primeNumber;i++){
                if(primeNumber%i==0)
                    return false;
            }
        }
        return true;
    }


}
