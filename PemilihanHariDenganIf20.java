import java.util.Scanner;
/**
 * PemilihanHariDenganIf20
 */
public class PemilihanHariDenganIf20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the number");
       int angka = sc.nextInt();

       String hasil;

       if (angka <= 5) {
        hasil = "weekday";
       }
       else if (angka <= 7) {
        hasil = "weekend";
       }
       else {
        hasil = "invalid number";
       }
       System.out.println("angka " + angka + "is a" + hasil);
    }
}
