public abstract class Pembayaran {
    protected String namaPembayar;
    protected double nominal;

    // constructor
    public Pembayaran(String namaPembayar, double nominal) {
        this.namaPembayar = namaPembayar;
        this.nominal = nominal;
    }

    // method
    public void tampilkanDetail() {
        System.out.println("Nama Pembayar : " + namaPembayar);
        System.out.println("Nominal       : " + nominal);
    }

    // abstract method
    public abstract void prosesPembayaran();
}

// Abstract class sebagai induk semua pembayaran //
//  Menyimpan namaPembayar dan nominal, memiliki method tampilkanDetail(), serta method abstrak prosesPembayaran() //