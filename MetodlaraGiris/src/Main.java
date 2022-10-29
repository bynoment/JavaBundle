import java.util.Scanner;

public class Main {
    public static  void selamlama(){
        System.out.println("Merhaba Dünya!");
        System.out.println("Selamlar");

    }
    public static void faktoriyel()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel : " + faktoriyel);
    }
    public static void main(String[] args) {
        /*
        Erişim_Belirleyici (opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler) {
        //Burası Fonksiyon Bloğu

        //Fonksiyonun yapacağı işlemler burada olacak.
         */


        faktoriyel();



    }
}