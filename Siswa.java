public class Siswa {
    String nama;
    int tahunLahir;

    public Siswa(String nama, int tahunLahir) {
        this.nama = nama;
        this.tahunLahir = tahunLahir;
    }

    //memangil nama
    public void tampilNama() {
        System.out.println("Nama Siswa: " + nama);
    }

    //Menghitung Usia
    public int usia() {
        return 2024 - tahunLahir;
    }

    //Studi kasus 1
    public int tampilNilai() {
        return (int) (Math.random() * 100);
    }

    //Studi kasus 2
    public String keteranganPrestasi() {
        int nilai = tampilNilai();
        if (nilai >= 80) {
            return "Prestasi Bagus";
        } else if (nilai >= 60) {
            return "Prestasi Cukup";
        } else {
            return "Butuh Perbaikan";
        }
    }

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Rafi", 2008);

        siswa1.tampilNama();
        System.out.println("Usia: " + siswa1.usia() + " tahun");

        System.out.println("Nilai Akademik: " + siswa1.tampilNilai());
        System.out.println("Prestasi: " + siswa1.keteranganPrestasi());
    }
}
