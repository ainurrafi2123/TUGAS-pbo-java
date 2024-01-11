public class Sahur {
    public static void main(String[] args) {
        Siswa1 s = new Siswa1();
        s.tampilNama();
        System.out.println("Usia: "+s.usia(2008));
        Armor armor1 = new Armor("Baju besi",5,100);

        // Studi Kasus 1


        // Studi kasus 2
    }
}

//  PR Buatlah Satu Class Dan Satu Object dengan studi kasus berbeda 
// Belajar enkolapsi PBO java
    class Armor{
        private String name;
        private int strenght;
        private int health;

        public Armor(String name, int strenght, int health){
            this.name = name;
            this.strenght = strenght;
            this.health = health;
            
        }

    } 

