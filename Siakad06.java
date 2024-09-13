import java.util.Scanner;

public class Siakad06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, nim, kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

    System.out.println("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.println("Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.println("Masukkan kelas: ");
    kelas = sc.nextLine();
    System.out.println("Masukkan nomor absen:");
    absen = sc.nextByte();

    System.out.println("masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.println("masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.println("masukkan nilai uts: ");
    nilaiUts = sc.nextDouble();
    System.out.println("masukkan nilai uas: ");
    nilaiUas = sc.nextDouble();


    nilaiAkhir = (nilaiKuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUts * 30/100) + (nilaiUas * 35/100);

    System.out.println("Nama: " + nama + "NIM: " + nim);
    System.out.println("Kelas: " + kelas + "Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
