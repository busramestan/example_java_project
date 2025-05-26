import java.util.Scanner;

public class EnBuyukSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan 3 sayi al

        System.out.println("1. sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("2. sayıyyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("3. sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int enBuyuk;

        if (sayi1 >= sayi2 && sayi1 >=sayi3 ){
            enBuyuk = sayi1;

        } else if (sayi2 >= sayi1 && sayi2 >= sayi3 ) {
            enBuyuk = sayi2;

        } else {
            enBuyuk =sayi3;
        }
        System.out.println("En Büyük Sayi: " +enBuyuk);
        scanner.close();

    }
}
