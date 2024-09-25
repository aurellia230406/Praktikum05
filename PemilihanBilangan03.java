import java.util.Scanner;

public class PemilihanBilangan03 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = Input.nextInt();

            System.out.println((angka % 2 == 0) ? "Angka " + angka + "termasuk bilangan genap" : "Angka " + angka + 
            " termasuk bilangan ganjil");
            Input.close();
        }
    }