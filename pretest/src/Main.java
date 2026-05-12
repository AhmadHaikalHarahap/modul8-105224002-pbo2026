// Kelas Main untuk uji program
public class Main {
    public static void main(String[] args) {
        Programmer prog = new Programmer("Budi", 8500000);

        System.out.println("Nama     : " + prog.nama);
        System.out.println("Total Gaji: " + prog.hitungGaji());
    }
}