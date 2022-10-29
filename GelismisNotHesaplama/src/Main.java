import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Vize1-Vize2 ve Final notnu alarak bir harf hesaplama sistemi yap.
        Ayrıca kullanıcıdan okuldaki genel ortalamısını alarak
        DD alma ve 2.50 'nin altına olma koşuluna göre ekrana tavsiye mesajı yazdır.
        Vize1 toplam notun %30 etki edecek
        Vize 2 toplam notun %30 etki edecek
        Final toplam notun %40 etki edecek.

        Toplam not >= 90 -- AA
        Toplam not >= 85 -- BA
        Toplam not >= 80 -- BB
        Toplam not >= 75 -- CB
        Toplam not >= 70 -- CC
        Toplam not >= 65 -- DC
        Toplam not >= 60 -- DD
        Toplam not >= 55 -- FD
        Toplam not < 55 -- FF
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize 1 notunuzu giriniz");
        int vize1 = scanner.nextInt();
        System.out.println("Vize 2  notunuzu giriniz");
        int vize2 = scanner.nextInt();
        System.out.println("Final notunuzu giriniz");
        int finalnot = scanner.nextInt();
        double toplam = (vize1 * 3/10.0) + (vize2 * 3/10.0) + (finalnot * 4 / 10.0);
        System.out.println("Okul Ortalamanız: ");
        double ortalama = scanner.nextDouble();
        System.out.println("Ortalamanız : " + toplam);
        System.out.println("***Notunuz***");
        if (toplam >= 90) {
            System.out.println("AA Aldınız");
        } else if (toplam >= 85) {
            System.out.println("BA Aldınız");
        } else if (toplam >= 80) {
            System.out.println("BB Aldınız");
        } else if (toplam >= 75) {
            System.out.println("CB Aldınız");
        } else if (toplam >= 70) {
            System.out.println("CC Aldınız");
        } else if (toplam >= 65) {
            System.out.println("DC Aldınız");
        } else if (toplam >= 60) {
            System.out.println("DD Aldınız");
        } if (ortalama <= 2.50) {
            System.out.println("DD Aldınız ve not ortalamanız düşük.");

        } else if (toplam >= 55) {
            System.out.println("FD Aldınız");
        }
        else  {
            System.out.println("FF Aldınız. Kaldınız.");
        }


    }
}