import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bir aracın kilometrede ne kadar yaktığını ve kaç kilometre yol yaptığı bilgilerini alın ve sürücünün toplam
        //ne kadar ödemesi gerektiğini hesaplayın.
        // Formul kurus * km

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilometrede kaç kuruş yakıyor? Örn: 0,32");
        double kurus = scanner.nextDouble();
        System.out.print("Kaç km yol gidicek: Örn: 85 ");
        int km = scanner.nextInt();

        System.out.println("Toplam" + kurus * km +"Tl ' dir..");






    }
}