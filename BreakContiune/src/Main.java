import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        break anahtar kelimesi
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmayı durdurur.
        Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

        break sadece ve sadece içinde bulunduğu döngüyü sonlandırır.Eğer iç içe döngüler varsa
        ve içteki döngüde break kullanılmamışsa sadece içteki döngü sona erer.

        Continue anahtar kelimesi
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman geri kalan
        işlemeirni ypamadan direk döngü bloğunun başına döner.
         */

        /*Scanner scanner = new Scanner(System.in);
        while (true) {
            int islem = scanner.nextInt();
            if (islem == -1) {
                System.out.println("Döngüden çıkılıyor.");
                break;
            }
            System.out.println("İşlem: " + islem);

        }*/


        /*for (int i = 0 ; i < 10 ; i++) {
            if (i == 3 || i == 5) {
             continue;  //i 3 ve 5 olursa işlem yapma devam et anlamına geliyor.

            }

            System.out.println("i = " + i);
        }*/

        int i = 0 ;
        while (i < 10) {
            if (i == 3 || i == 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}