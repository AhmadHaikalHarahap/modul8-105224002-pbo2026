public interface Asuransi {
    double hitungPremi(double nilaiBarang);

    default void cetakPolis() {
        System.out.println("Polis Asuransi aktif: Menanggung 100% kerugian.");
    }
}

// Interface untuk layanan asuransi //
// Memiliki method hitungPremi() dan default method cetakPolis() untuk menampilkan informasi polis //