import java.util.Scanner;

public class MataKuliahDemo{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MataKuliah10[] arrayOfMataKuliah = new MataKuliah10[3]; 
        for(int i = 0; i < 3; i++) {

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("SKS : ");
            int sks = Integer.parseInt(sc.nextLine());

            System.out.print("Jam : ");
            int jumlahJam = Integer.parseInt(sc.nextLine());

            arrayOfMataKuliah[i] =
                new MataKuliah10(kode, nama, sks, jumlahJam);
        }
    }
}