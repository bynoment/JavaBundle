import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        do {
         //koşul doğru olduğu sürece
         // whiledan farkı en az 1 kere çalışmasının garanti olması
         // Bug find için kullanılıyor genelde.

         }while (koşul);

         */
        /*int i = 0 ;

        do {
            System.out.println("i = " + i);
            i++;
        }while (i < 5);*/

        //1234

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi = scanner.nextInt();
        int toplam = 0;
        do {
            toplam += sayi % 10;
            sayi = sayi / 10;

        }while (sayi > 0);
        System.out.println("Rakamların toplamı "+ toplam);



    }
}