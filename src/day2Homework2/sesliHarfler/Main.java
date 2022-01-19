package day2Homework2.sesliHarfler;

public class Main {
    public static void main(String[] args) {
        checker('f');
    }
    public static boolean checker(char word){
        switch (Character.toLowerCase(word)){
            case 'a':
            case 'u':
            case 'o':
            case 'ı':
                System.out.println(word+" Kalın seslidir");
                break;
            case 'e':
            case 'ö':
            case 'i':
            case 'ü':
                System.out.println(word+" İnce seslidir");
                break;
            default:
                System.out.println(word+" Yanlış bir char girdin knk");
        }
       return true;
    }
}
