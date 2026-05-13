public class Main {
    public static void main(String[] args) {

        // objek
        LayananPengiriman darat = new PengirimanDarat("DRT-001", 50, 100, "Tronton");
        LayananPengiriman udara = new PengirimanUdara("UDR-999", 10, 800, "GA-123", 5000000);

        // update status
        ((LacakKargo) darat).updateStatus("Sedang di jalan tol Cipali");
        ((LacakKargo) udara).updateStatus("Transit di Bandara Soekarno-Hatta");

        // array polymorphism
        LayananPengiriman[] daftar = {darat, udara};

        for (LayananPengiriman lp : daftar) {
            System.out.println("===== DATA PENGIRIMAN =====");
            lp.cetakResi();

            double ongkir = lp.hitungOngkosKirim();

            // Cek lokasi
            if (lp instanceof LacakKargo) {
                LacakKargo lk = (LacakKargo) lp;
                System.out.println("Status: " + lk.cekLokasiTerakhir());
            }

            double total = ongkir;

            // Cek asuransi
            if (lp instanceof Asuransi) {
                Asuransi as = (Asuransi) lp;
                as.cetakPolis();

                double premi = as.hitungPremi(5000000);
                System.out.println("Premi Asuransi: " + premi);

                total += premi;
            }

            System.out.println("Ongkos Kirim: " + ongkir);
            System.out.println("Total Bayar : " + total);
            System.out.println("============================\n");
        }
    }
}

// Class utama untuk menjalankan program //
// Membuat objek darat dan udara, menyimpannya dalam array, lalu menampilkan data, status, ongkir, serta menghitung total pembayaran dengan pengecekan instanceof //