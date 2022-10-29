import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan boy ve kilo değerleri ile beden kitle indeksini bulmak. Kilo / boy * boy


        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu Giriniz: Örnek 1,85 : ");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Kilo Indeksiniz:  " +bki);


    }
}