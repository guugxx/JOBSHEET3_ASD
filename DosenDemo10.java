import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen10[] arrayOfDosen = new Dosen10[3];

        for (int i = 0; i < 3; i++) {

            arrayOfDosen[i] = new Dosen10(); // pakai konstruktor kosong

            System.out.println("\nMasukkan Data Dosen ke-" + (i+1));

            System.out.print("Kode   : ");
            arrayOfDosen[i].kode = sc.nextLine();

            System.out.print("Nama   : ");
            arrayOfDosen[i].nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            String jk = sc.nextLine();
            arrayOfDosen[i].jenisKelamin = jk.equalsIgnoreCase("L");

            System.out.print("Usia   : ");
            arrayOfDosen[i].usia = Integer.parseInt(sc.nextLine());
        }

        

        System.out.println("\n===== DATA DOSEN =====");

        for (Dosen10 dsn : arrayOfDosen) {
            dsn.cetakInfo();
        }

        sc.close();
    }
}