import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class Werehouse {
    ArrayList<Barang> listBarang = new ArrayList<>();
    ArrayList<Customer> listCustomer = new ArrayList<>();
    ArrayList<Supplier> listSupplier = new ArrayList<>();

    

    public void tambahBarang(Barang barang) {
        listBarang.add(barang);
        
    }

    public void lihatBarang() {
        for (Barang barang : listBarang) {
            System.out.println("Nama: " + barang.nama + ", Kode: " + barang.kode + ", Jumlah: " + barang.jumlah +
                    ", Harga: " + barang.harga + ", Kategori: " + barang.kategori);
        }
    }

    public void updateBarang(int kode, int jumlah) {
        for (Barang barang : listBarang) {
            if (barang.kode == kode) {
                barang.jumlah += jumlah;
                System.out.println("Jumlah barang dengan kode " + kode + " berhasil diupdate.");
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

    public void hapusBarang(int kode) {
        for (Barang barang : listBarang) {
            if (barang.kode == kode) {
                listBarang.remove(barang);
                System.out.println("Barang dengan kode " + kode + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

     public void tambahCustomer(Customer customer) {
        listCustomer.add(customer);
    }

    public void lihatCustomer() {
        for (Customer customer : listCustomer) {
            System.out.println("Nama: " + customer.nama + ", Balance: " + customer.balance +
                    ", Address: " + customer.address + ", Phone Number: " + customer.phoneNumber +
                    ", Birthdate: " + customer.birthdate);
        }
    }

    public void updateCustomerBalance(String nama, double newBalance) {
        for (Customer customer : listCustomer) {
            if (customer.nama.equals(nama)) {
                customer.balance = newBalance;
                System.out.println("Balance customer " + nama + " berhasil diupdate.");
                return;
            }
        }
        System.out.println("Customer dengan nama " + nama + " tidak ditemukan.");
    }

    public void hapusCustomer(String nama) {
        for (Customer customer : listCustomer) {
            if (customer.nama.equals(nama)) {
                listCustomer.remove(customer);
                System.out.println("Customer dengan nama " + nama + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Customer dengan nama " + nama + " tidak ditemukan.");
    }

    public void simpanDataCustomerKeFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("customer.txt"))) {
            for (Customer customer : listCustomer) {
                writer.println(customer.nama + "," + customer.balance + "," + customer.address + "," +
                        customer.phoneNumber + "," + customer.birthdate);
            }
            System.out.println("Data customer berhasil disimpan ke dalam file customer.txt.");
        } catch (IOException e) {
            System.out.println("Error saat menyimpan data customer ke dalam file.");
            e.printStackTrace();
        }
    }
    public void tambahSupplier(Supplier supplier) {
        listSupplier.add(supplier);
    }

    public void lihatSupplier() {
        for (Supplier supplier : listSupplier) {
            System.out.println("Nama: " + supplier.nama + ", Alamat: " + supplier.alamat +
                    ", Nomor Telepon: " + supplier.nomorTelepon + ", Email: " + supplier.email +
                    ", Jenis Barang: " + supplier.jenisBarang);
        }
    }

    public void updateSupplierEmail(String nama, String newEmail) {
        for (Supplier supplier : listSupplier) {
            if (supplier.nama.equals(nama)) {
                supplier.email = newEmail;
                System.out.println("Email supplier " + nama + " berhasil diupdate.");
                return;
            }
        }
        System.out.println("Supplier dengan nama " + nama + " tidak ditemukan.");
    }

    public void hapusSupplier(String nama) {
        for (Supplier supplier : listSupplier) {
            if (supplier.nama.equals(nama)) {
                listSupplier.remove(supplier);
                System.out.println("Supplier dengan nama " + nama + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Supplier dengan nama " + nama + " tidak ditemukan.");
    }
    
    public void simpanDataBarangKeFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("barang.txt"))) {
            for (Barang barang : listBarang) {
                writer.println(barang.nama + "," + barang.kode + "," + barang.jumlah + "," +
                        barang.harga + "," + barang.kategori);
            }
            System.out.println("Data barang berhasil disimpan ke dalam file barang.txt.");
        } catch (IOException e) {
            System.out.println("Error saat menyimpan data barang ke dalam file.");
            e.printStackTrace();
        }
    }
    

    public void simpanDataSupplierKeFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("supplier.txt"))) {
            for (Supplier supplier : listSupplier) {
                writer.println(supplier.nama + "," + supplier.alamat + "," + supplier.nomorTelepon + "," +
                        supplier.email + "," + supplier.jenisBarang);
            }
            System.out.println("Data supplier berhasil disimpan ke dalam file supplier.txt.");
        } catch (IOException e) {
            System.out.println("Error saat menyimpan data supplier ke dalam file.");
            e.printStackTrace();
        }
    }

    public void bubbleSortBarangByNama() {
        int n = listBarang.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listBarang.get(j).nama.compareTo(listBarang.get(j + 1).nama) > 0) {
                    Barang temp = listBarang.get(j);
                    listBarang.set(j, listBarang.get(j + 1));
                    listBarang.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("Barang berhasil diurutkan berdasarkan nama menggunakan Bubble Sort.");
    }

    public void bubbleSortCustomerByNama() {
        int n = listCustomer.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listCustomer.get(j).nama.compareTo(listCustomer.get(j + 1).nama) > 0) {
                    Customer temp = listCustomer.get(j);
                    listCustomer.set(j, listCustomer.get(j + 1));
                    listCustomer.set(j + 1, temp);
                }
            }
        }
        System.out.println("Customer berhasil diurutkan berdasarkan nama menggunakan Bubble Sort.");
    }

    public void bubbleSortSupplierByNama() {
        int n = listSupplier.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listSupplier.get(j).nama.compareTo(listSupplier.get(j + 1).nama) > 0) {
                    Supplier temp = listSupplier.get(j);
                    listSupplier.set(j, listSupplier.get(j + 1));
                    listSupplier.set(j + 1, temp);
                }
            }
        }
        System.out.println("Supplier berhasil diurutkan berdasarkan nama menggunakan Bubble Sort.");
    }

    public Barang sequentialSearchBarangByNama(String nama) {
        for (Barang barang : listBarang) {
            if (barang.nama.equalsIgnoreCase(nama)) {
                return barang;
            }
        }
        return null;
    }

    public Customer sequentialSearchCustomerByNama(String nama) {
        for (Customer customer : listCustomer) {
            if (customer.nama.equalsIgnoreCase(nama)) {
                return customer;
            }
        }
        return null;
    }

    public Supplier sequentialSearchSupplierByNama(String nama) {
        for (Supplier supplier : listSupplier) {
            if (supplier.nama.equalsIgnoreCase(nama)) {
                return supplier;
            }
        }
        return null;

    
    }

    public void searchAndSortBarang(String nama) {
        Barang hasilPencarian = sequentialSearchBarangByNama(nama);

        if (hasilPencarian != null) {
            System.out.println("Barang " + nama + " ditemukan: " +
                    "Kode " + hasilPencarian.kode + ", Jumlah " + hasilPencarian.jumlah);
        } else {
            System.out.println("Barang " + nama + " tidak ditemukan.");
            return;
        }
        bubbleSortBarangByNama();
        lihatBarang();

    }
}