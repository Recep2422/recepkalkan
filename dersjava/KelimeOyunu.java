package dersjava;
import java.util.Scanner;
public class KelimeOyunu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        String gizliKelime = "elma"; // Tahmin edilecek kelime
        String tahmin;
        int hak = 3; // 3 tahmin hakkı

        System.out.println("Kelime Tahmin Oyununa Hoş Geldin!");
        System.out.println("3 hakkın var. Gizli kelimeyi tahmin et!");

        while (hak > 0) {
            System.out.print("Tahminini gir: ");
            tahmin = scanner.nextLine();

            if (tahmin.equalsIgnoreCase(gizliKelime)) {
                System.out.println("Tebrikler! Doğru tahmin ettin.");
                return;
            } else {
                hak--;
                System.out.println("Yanlış tahmin. Kalan hakkın: " + hak);
            }
        }

        System.out.println("Oyun bitti. Doğru kelime: " + gizliKelime);
	}
}
