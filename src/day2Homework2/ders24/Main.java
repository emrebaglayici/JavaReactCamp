package day2Homework2.ders24;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    //camel casing
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{1,25,7,9,0};
        int aranacak=6;
        boolean varMi=false;
        for (int sayi:sayilar) {
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj="";
        if(varMi){
            mesaj="Sayi mevcut : "+aranacak;
            mesajVer(mesaj);
        }else{
            mesajVer("Sayi mevcut değildir : "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
