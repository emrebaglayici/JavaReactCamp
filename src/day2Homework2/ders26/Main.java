package day2Homework2.ders26;

public class Main {
        public static void main(String[] args) {
            int toplam=topla2(1,2,3,4,6);
            System.out.println(toplam);
        }

        //... var args int array göndermişiz gibi oluyor
        public static int topla2(int... sayilar){
            int toplam=0;
            for (int sayi:sayilar) {
                toplam+=sayi;
            }
            return toplam;
        }

}
