import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while döngüsü ile kullanıcı girişi yaz

        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;

        String sys_kullanici_adi = "arwalee";
        String sys_parola = "123321";

        System.out.println("***************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz.");
        System.out.println("***************************");


        String parola;
        String kullanici;
        while (true) {

            System.out.print("Kullanıcı Adı  : ");
            kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            parola = scanner.nextLine();

            /*parola.equals(sys_parola);  //girilen parola değeri ile sys_parola değeri tutarsa true. Değilse false*/

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) { //Kullanıcı adı - şifre girişi kontrolü
                System.out.println("Hoşgeldiniz " + kullanici);//Doğru giriş yaptıysa sout + break ile while sonlanıyor.
                break;
            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) { //Parola başına ! koyarak not haline getirdik.Doğru olmadığı durumu sorgulama
                System.out.println("Parola yanlış");
            giris_hakki -= 1;
        } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.print("Kullanıcı adınız yanlış");
                giris_hakki -= 1;

            }
            else {
                System.out.println("Kullanıcı adı veya şifre hatalı." + "Kalan Deneme Hakkı: " + giris_hakki);
                giris_hakki -= 1;
            }
            if (giris_hakki == 0)  {
                System.out.println("Giriş hakkınız bitti");
                break;

            }

        }






        
    }
}