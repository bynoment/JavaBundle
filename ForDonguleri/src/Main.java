import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        For (başlatma ; kosul ; arttırma veya azaltma işlemleri) {
            Döngü koşulu doğru olunca bura çalışacak
            }
        */

        /*int i;
        for (i = 0; i < 5 ; i++) {

            System.out.println("i = " + i );
        }*/

        /*for (int i = 0; i < 5 ; i++) {
            System.out.println("i = " + i);

        }*/

        /*for (int i = 10; i >=0 ; i--) {
            System.out.println("i = " + i);
        }*/

        /*int i = 0;
        for (;i<5 ; i++) {
            System.out.println("Java öğreniyorum");
        }*/

       /* int i = 0;
        int j = 10;
        for (;i < 10 && j > 0; i++,j--) {
            System.out.println("i= " + i);
            System.out.println("J = " + j);
        }*/

        /*for (int i = 2; i<100 ; i *= 2) {
            System.out.println("i = " + i);
        }*/

        // 5 değerini girdiğinde faktöriyel 5! = 5.5 5.4 5.3 5.2 5.1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int faktoriyel = 1;
        int sayi = scanner.nextInt();

        for (int i = 1 ; i <= sayi; i++) {

            faktoriyel *= i;
            System.out.println("Faktöriyel = " + faktoriyel + " i = " + i);

        }
        System.out.println("Faktöriyel = " + faktoriyel);






    }
}