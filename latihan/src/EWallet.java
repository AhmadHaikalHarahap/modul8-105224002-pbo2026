public class EWallet extends Pembayaran implements Keamanan {
    private String nomorHP;

    public EWallet(String namaPembayar, double nominal, String nomorHP) {
        super(namaPembayar, nominal);
        this.nomorHP = nomorHP;
    }

    @Override
    public boolean autentikasi() {
        System.out.println("Autentikasi berhasil (E-Wallet)");
        return true;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Nomor HP      : " + nomorHP);
        System.out.println("Tanpa biaya admin");
        System.out.println("Total Bayar   : " + nominal);
    }
}

// Turunan Pembayaran yang juga mengimplementasikan Keamanan //
// Memiliki atribut nomorHP. Tidak ada biaya admin, sehingga total sama dengan nominal //