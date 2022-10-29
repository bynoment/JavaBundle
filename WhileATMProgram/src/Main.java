import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

               /*
        While döngüsü ile bir atm programı.
        İşlemler
        1.İşlem : Bakiye Öğrenme
        2. İşlem : Para çekme
        3. İşlem : para yatırma
        Çıkış : q
         */

        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                + "2.İşlem : Para çekme \n"
                + "3.İşlem : Para Yatırma\n"
                + "4. İşlem : Çıkış için q ya basın.";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");
        String islem;
        while (true) {  //İşlem sürekli aktif kalması için.
            System.out.println("İşlemi seçiniz");
            islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor..");
                break;


            } else if (islem.equals("1")) {
                System.out.println("Güncel Bakiyeniz : " + bakiye);


            } else if (islem.equals("2")) {
                System.out.println("Çekilecek Miktarı Giriniz.: ");
                int tutar = scanner.nextInt();
                if (bakiye - tutar < 0) {
                    System.out.println("Yetersiz Bakiye.");
                }
                scanner.nextLine();
                bakiye -= tutar;
                System.out.println("Kalan Bakiyeniz : " + bakiye);

            } else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz Miktarı Giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;
                System.out.println("Para yatırma işlemi başarılı..");
                System.out.println("Güncel Bakiyeniz" + bakiye);

            } else {
                System.out.println("Geçersiz İşlem.");
            }

        }
    }
}