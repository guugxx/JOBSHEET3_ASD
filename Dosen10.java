public class Dosen10 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    // Konstruktor kosong
    public Dosen10() {
    }

    // Konstruktor berparameter
    public Dosen10(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------");
    }
}