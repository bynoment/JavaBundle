import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        if (koşul) {
        koşul sağlanınca(true)bu blok çalıştır.
        }
        else {
        bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu  blok çalışır.

        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Yaşınızı Giriniz.");
        int yas = scanner.nextInt();

        if (yas < 18) {
            System.out.println("Bu mekana giremezsiniz.");

        }
        else {
            System.out.println("Giriş yapabilirsiniz.");
        }





    }
}