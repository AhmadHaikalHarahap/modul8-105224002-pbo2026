import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // membuat objek
        Pembayaran kk = new KartuKredit("Haikal", 1000000, "1234-5678-9999");
        Pembayaran ew = new EWallet("Budi", 500000, "08123456789");

        // ArrayList
        ArrayList<Pembayaran> daftar = new ArrayList<>();
        daftar.add(kk);
        daftar.add(ew);

        // perulangan
        for (Pembayaran p : daftar) {
            System.out.println("=== Detail Transaksi ===");
            p.tampilkanDetail();

            // cek apakah implement Keamanan
            if (p instanceof Keamanan) {
                Keamanan k = (Keamanan) p;

                if (k.autentikasi()) {
                    p.prosesPembayaran();
                }
            }

            System.out.println();
        }
    }
}

// Membuat objek, menyimpannya dalam ArrayList, lalu menampilkan detail, melakukan autentikasi, dan memproses pembayaran menggunakan perulangan dan instanceof //