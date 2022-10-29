public class Main {
    public static void main(String[] args) {
        /*
        Mantıksal operatörler
        && --> and Operatörü
        Bütün sonuçlkar kendi içinde true ise genel sonuç true, en az biri bile false ise genel sonuç false.

        || --> or operatörü. alt + tire ile yazılıyor.
        Sonuçlardan en az birisi bile true ise genel sonuç ture, hepsi false ise genel sonuç false olur.

        ! --> not operatörü
        True olan işlemi false ye false yi true çeviriyor.
         */

          // System.out.println(3 != 3 || 2 > 3 || "Murat" != "Murat");
        //System.out.println(!(3 < 4));

        System.out.println(!((3<4 && "Murat" == "Murat") || 3.4 > 2.1));




    }
}