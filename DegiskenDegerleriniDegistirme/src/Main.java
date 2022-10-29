import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan aldığın iki sayının değerlerini değiştirin.

        Scanner scanner = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("Birinci Sayı : ");
        birinci_sayi = scanner.nextInt();
        System.out.print("İkinci Sayı :");
        ikinci_sayi = scanner.nextInt();
        System.out.println("Değiştirilmeden önce ...");
        System.out.println("Birinci sayı:"+ birinci_sayi + "İkinci Sayı: "+ ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        System.out.println("Değiştirildikten sonra..");
        System.out.println("Birinci Sayı: "+ birinci_sayi + "İkinci sayı : " + ikinci_sayi);






    }
}