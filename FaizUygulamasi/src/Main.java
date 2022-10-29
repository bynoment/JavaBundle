import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faiz uygulaması
        Kullanıcından anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın
        Faiz oranı : %6 Faiz
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Güncel Faiz Oranı %6 ");

         double anapara,vade;
        System.out.print("Lütfen Ana Para Faize yatırılacak para miktarını girin: ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz? :");
        vade = scanner.nextInt();

        double toplampara = anapara;

        double faizOrani = 0.06;

        for (int i = 1; i<= vade ; i++) {
            toplampara = (toplampara * faizOrani) + toplampara;

            System.out.println(i + ". yılın sonunda toplam para : " + (int)toplampara);

        }




    }
}