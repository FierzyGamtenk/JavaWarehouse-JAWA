class Supplier {
    String nama;
    String alamat;
    String nomorTelepon;
    String email;
    String jenisBarang;

    public Supplier(String nama, String alamat, String nomorTelepon, String email, String jenisBarang) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisBarang = jenisBarang;
    }
    
    public String toString() {
        return "Nama: " + nama + ", Alamat: " + alamat +
                ", Nomor Telepon: " + nomorTelepon + ", Email: " + email +
                ", Jenis Barang: " + jenisBarang;
    }
}