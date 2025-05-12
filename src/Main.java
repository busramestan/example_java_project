//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc;
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Bir sayı sıfıra bölünemez.");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi.");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
