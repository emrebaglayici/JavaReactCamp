package day2Homework2.sayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        check(array,12);
    }
    static boolean check(int[] numbers,int search){
        for (int x:numbers) {
            if(x==search){
                System.out.println("Sayi bulundu");
                break;
            }
            else{
                System.out.println("Sayı bulunamadı");
                break;
            }
        }
        return true;
    }
}
