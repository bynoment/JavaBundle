import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcan alınan 3 sayının en büyüğünü bulma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayı giriniz");
        int a = scanner.nextInt();
        System.out.println("İkinci sayıyı giririniz");
        int b = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz");
        int c = scanner.nextInt();

        int maks = -1;
        if (a >= b && a >= c) {
            maks = a;
        }
        else if (b >=a && b >=c ) {
            maks = b;
        }
        else {
            maks = c;
        }
        System.out.println("Maksimum sayı" + maks);
    }
}