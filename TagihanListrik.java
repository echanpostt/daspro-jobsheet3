import java.util.Scanner;

/**
 * tugas1
 */
public class TagihanListrik {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double Listrik, Tagihan;
    int tarif = 1500;
    System.out.println("masukkan penggunaan Listrik dalam bentuk kWh: ");
    Listrik = sc.nextDouble();
    Tagihan = Listrik * tarif;
    boolean lebih = Listrik > 500;
    System.out.println("Tagihan Listrik anda Rp " + Tagihan);
    System.out.println("apakah melebihi 500 kWh? " + lebih);
    

        
    }
}