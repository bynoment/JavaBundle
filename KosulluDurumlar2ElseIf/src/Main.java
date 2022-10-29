import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        if (koşul) {
        }
        else if (kosul) {
        }
        else if (kosul) {
        }
        else {
         kosul
        }
         */
        System.out.println("Lütfen Notunuzu giriniz.");
        Scanner scanner = new Scanner(System.in);
        int not = scanner.nextInt();
        if (not >= 90){
            System.out.println("AA");
        }
        else if (not >= 85) {
            System.out.println("BA");
        }
        else if (not >= 80 ) {
            System.out.println("BB");
        }
        else if (not >=75 ) {
            System.out.println("CB");
        }
        else if (not >=65 ) {
        System.out.println("CC");
        }
        else if (not >=60 ) {
            System.out.println("DD");
        }
        else {
            System.out.println("Dersten kaldınız..");
        }





    }
}