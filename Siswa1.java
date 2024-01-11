public class Siswa1 {
    public static void main(String[] args) {
        System.out.println("semangat belajar");
        Siswa s= new Siswa1();
        s.tampilNama();
        System.out.println(s.usia(2008));
    }

    public void tampilNama(){
        String nama="arema";
        System.out.println("Nama Siswa:"+ nama);
    }

    public int usia(int tahunLahir){
        int usia=2024-tahunLahir;
        return usia;
    }
}
    
