import java.util.Scanner;
/**
 * SIAKAD20
 */
public class SIAKAD20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim, kelas;
        int absen, nilaiTugas, nilaiKuis, nilaiUjian;
        double nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();

        System.out.print("Masukkan Kelas: ");
        kelas = input.nextLine();

        System.out.print("Masukkan Nomor Absen: ");
        absen = input.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextInt();

        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextInt();

        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiKuis * 0.3) + (nilaiUjian * 0.4);
        System.out.println("Nilai akhir: " + nilaiAkhir);

        String nilaiHuruf = "";
        double nilaiSetara = 0.0;
        String kualifikasi = "";

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (nilaiAkhir < 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama: " + nama + " (NIM) " + nim + " kelas " + kelas + " nomer absen " + absen);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        
    }
}