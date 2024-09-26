import java.util.Scanner;
/**
 * LatihanIndividu4
 */
public class LatihanIndividu4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

            if (usia < 0) {
                System.out.print("Input tidak valid");
                } else if (usia >= 0 && usia <= 12) {
                    System.out.print("Kategori: Anak");
                } else if (usia >= 13 && usia <= 19) {
                    System.out.print("Kategori: Remaja");
                } else if (usia >= 20 && usia <= 64) {
                    System.out.print("Kategori: Dewasa");
                } else {
                    System.out.print("Kategori: Lansia");
                }
        }
    }
