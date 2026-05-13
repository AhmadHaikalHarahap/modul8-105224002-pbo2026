public interface LacakKargo {
    void updateStatus(String status);
    String cekLokasiTerakhir();
}

// Interface untuk fitur pelacakan //
// Berisi method updateStatus() untuk mengubah status dan cekLokasiTerakhir() untuk melihat posisi terakhir barang //