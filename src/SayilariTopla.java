import java.util.Scanner;

public class SayilariTopla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz:");
        int n = scanner.nextInt();

        int toplam = 0;

        for(int i=1; i <= n ; i++){

            toplam = toplam + i;
        }
        System.out.println("1'den " + n +"'e kadar olan sayıların toplamı: " +toplam );
        scanner.close();
    }
}
