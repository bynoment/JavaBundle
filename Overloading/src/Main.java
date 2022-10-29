public class Main {
    public static void toplama (String a , String b) {
        System.out.println(a +  ""  +b);
    }
    public static void toplama(int a , int b) {
        System.out.println("Toplamarı = " + (a+b));
    }
    public static void toplama(int a,int b, int c) {
        System.out.println("Toplamları : " + (a+b+c));
    }
    public static void main(String[] args) {
        toplama(3,4,5);
        toplama(2,5);
        toplama("Gökhan Savaşkan", "Java Öğreniyor!");


    }
}