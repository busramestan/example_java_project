import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notlar = new int[5];
        int toplam = 0;

        // 5 sınav notunu al
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i+1) + ". notu girin: ");
            notlar[i] = scanner.nextInt();
            toplam += notlar[i];
        }

        // Ortalamayı hesapla
        double ortalama = (double) toplam / notlar.length;
        System.out.println("Ortalama: " + ortalama);

        // Geçip geçmediğini kontrol et
        if (ortalama >= 50) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Maalesef, sınıfta kaldınız.");
        }

        scanner.close();
    }
}
