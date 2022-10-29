import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Switch case ile 4 işlem yapan hesap makinesi.
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************");
        String islemler = "1. Toplama İşlemi\n"
                         +"2. Çıkarma İşlemi\n"
                         +"3. Çarpma İşlemi\n"
                         +"4. Bölme İşlemi";
        System.out.println(islemler);



        System.out.println("*************************************");
        System.out.println("İşlemi Seçiniz: ");
        String islem = scanner.nextLine();
        int a;  //Burada int a ve b yi aşşağıda tekrar tekrar tanımlamak yerine tek de tanımladık
        int b;
        switch (islem){

            case "1":
                System.out.print("Birinci sayı");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Toplam " +  (a+b));
                break;
            case "2":
                System.out.print("Birinci sayı");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Çıkarma " +  (a-b));
                break;
            case "3":
                System.out.print("Birinci sayı");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Çarpma " +  (a*b));
                break;
            case "4":
                System.out.print("Birinci sayı");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println(" Bölüm " +  ((double)a/b));
                break;

            default:
                System.out.println("Hatalı sayı girildi.Listedeki numaraları seçiniz.");
                break;
        }



    }
}