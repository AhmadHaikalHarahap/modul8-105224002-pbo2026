public class KartuKredit extends Pembayaran implements Keamanan {
    private String nomorKartu;

    public KartuKredit(String namaPembayar, double nominal, String nomorKartu) {
        super(namaPembayar, nominal);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public boolean autentikasi() {
        System.out.println("Autentikasi PIN berhasil (Kartu Kredit)");
        return true;
    }

    @Override
    public void prosesPembayaran() {
        double biayaAdmin = 0.02 * nominal;
        double total = nominal + biayaAdmin;

        System.out.println("Nomor Kartu   : " + nomorKartu);
        System.out.println("Biaya Admin 2%: " + biayaAdmin);
        System.out.println("Total Bayar   : " + total);
    }
}

// Turunan Pembayaran yang mengimplementasikan Keamanan //
// Memiliki atribut nomorKartu. Saat proses pembayaran, dikenakan biaya admin 2% dari nominal //