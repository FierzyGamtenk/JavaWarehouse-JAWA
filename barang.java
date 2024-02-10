class Barang {
    String nama;
    int kode;
    int jumlah;
    double harga;
    String kategori;

    public Barang(String nama, int kode, int jumlah, double harga, String kategori) {
        this.nama = nama;
        this.kode = kode;
        this.jumlah = jumlah;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public String toString() {
        return "Nama: " + nama + ", Kode: " + kode + ", Jumlah: " + jumlah +
                ", Harga: " + harga + ", Kategori: " + kategori;
    }
}

