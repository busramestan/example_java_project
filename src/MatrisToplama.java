public class MatrisToplama {
    public static void main (String[] args) {

        // 2 adet 2x2 matris tanımladık
        int[][] matris1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matris2 = {
                {5, 6},
                {7, 8}
        };

        // Toplamı tutacak 2x2 matris
        int[][] toplamMatris = new int[2][2];

        // Matrisleri topla
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Toplam Matris:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(toplamMatris[i][j] + " ");
            }
            System.out.println();
        }
    }

}
