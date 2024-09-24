import java.util.Scanner;

public class PemilihanBilangan03 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = Input.nextInt();

        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    
    }
}