import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan boy ve kiloya göre beden kitle indeksi hesaplama ve koşullar
        Beden kitle indeksi : kilo / boy * boy
        BKI 18.5 in altındaysa - zayıf
        18.5 ile 25 arasındaysa -- normal
        25 ile 30 arasındaysa -- fazla kilolu
        30 üstündeyse -- obez
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu Yazınız");
        double boy = scanner.nextDouble();
        System.out.println("Kilonuzu yazınız");
        int kilo = scanner.nextInt();
        double bki = kilo / (boy * boy);
        System.out.println("Kitle Indeksiniz" + bki);

        if (bki >= 30) {
            System.out.println("Obezsiniz. az yiyin öleceksin");
        }
        else if (bki >=25 && bki < 30) {
            System.out.println("Fazla kilolusunuz");


        } else if (bki >=18.5 && bki < 25) {
            System.out.println("Normal");

        }else if (bki < 18.5) {
            System.out.println("Zayıfsınız");
        }
        else {
            System.out.println("Değer dışı rakam girildi.");
        }


    }
}