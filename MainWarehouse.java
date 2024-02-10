import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWarehouse {
    public static void main(String[] args) {
        Werehouse warehouse = new Werehouse();

        
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\fierz\\OneDrive\\Documents\\Algo\\warehouse\\barang.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                String nama = data[0];
                int kode = Integer.parseInt(data[1]);
                int jumlah = Integer.parseInt(data[2]);
                double harga = Double.parseDouble(data[3]);
                String kategori = data[4];

                Barang barang = new Barang(nama, kode, jumlah, harga, kategori);
                warehouse.tambahBarang(barang);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            Menu.mainmenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Menu.Warehousemenu();
                    int warehouseChoice = input.nextInt();

                    switch (warehouseChoice) {
                        case 1:
                            System.out.print("Masukkan nama barang: ");
                            String nama = input.next();
                            System.out.print("Masukkan kode barang: ");
                            int kode = input.nextInt();
                            System.out.print("Masukkan jumlah barang: ");
                            int jumlah = input.nextInt();
                            System.out.print("Masukkan harga barang: ");
                            double harga = input.nextDouble();
                            System.out.print("Masukkan kategori barang: ");
                            String kategori = input.next();

                            Barang newBarang = new Barang(nama, kode, jumlah, harga, kategori);
                            warehouse.tambahBarang(newBarang);
                            System.out.println("Barang berhasil ditambahkan.");
                            break;

                        case 2:
                            System.out.println("=== List Barang ===");
                            warehouse.lihatBarang();
                            break;

                        case 3:
                            System.out.print("Masukkan kode barang yang ingin diupdate: ");
                            int updateKode = input.nextInt();
                            System.out.print("Masukkan jumlah barang baru: ");
                            int updateJumlah = input.nextInt();
                            warehouse.updateBarang(updateKode, updateJumlah);
                            break;

                        case 4:
                            System.out.print("Masukkan kode barang yang ingin dihapus: ");
                            int deleteKode = input.nextInt();
                            warehouse.hapusBarang(deleteKode);
                            break;

                        case 5:
                            warehouse.bubbleSortBarangByNama();
                            break;

                        case 6:
                            System.out.print("Masukkan nama barang yang dicari: ");
                            String caribarangNama = input.next();
                            Barang barangByNama = warehouse.sequentialSearchBarangByNama(caribarangNama);
                            if (barangByNama != null) {
                            System.out.println("barang ditemukan: " + barangByNama.toString());
                            } else {
                            System.out.println("barang tidak ditemukan.");
                            }
                        break;

                        case 7 :
                            warehouse.simpanDataBarangKeFile();
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("Pilihan tidak valid.");
                    }

                case 2:
                Menu.Customermenu();
                int customerChoice = input.nextInt();

                switch (customerChoice) {
                    case 1:
                        System.out.print("Masukkan nama customer: ");
                        String customerNama = input.next();
                        System.out.print("Masukkan balance customer: ");
                        double customerBalance = input.nextDouble();
                        System.out.print("Masukkan alamat customer: ");
                        String customerAddress = input.next();
                        System.out.print("Masukkan nomor telepon customer: ");
                        String customerPhoneNumber = input.next();
                        System.out.print("Masukkan tanggal lahir customer: ");
                        String customerBirthdate = input.next();

                        Customer newCustomer = new Customer(customerNama, customerBalance, customerAddress,
                                customerPhoneNumber, customerBirthdate);
                        warehouse.tambahCustomer(newCustomer);
                        System.out.println("Customer berhasil ditambahkan.");
                        break;

                    case 2:
                        System.out.println("=== List Customer ===");
                        warehouse.lihatCustomer();
                        break;

                    case 3:
                        System.out.print("Masukkan nama customer yang ingin diupdate balance: ");
                        String updateNama = input.next();
                        System.out.print("Masukkan balance baru: ");
                        double newBalance = input.nextDouble();
                        warehouse.updateCustomerBalance(updateNama, newBalance);
                        break;

                    case 4:
                        System.out.print("Masukkan nama customer yang ingin dihapus: ");
                        String deleteNama = input.next();
                        warehouse.hapusCustomer(deleteNama);
                        break;

                    case 5:
                        warehouse.simpanDataCustomerKeFile();
                        break;

                    case 6:
                        warehouse.bubbleSortCustomerByNama();
                        break;

                    case 7:
                        System.out.print("Masukkan nama Customer yang dicari: ");
                        String caricustomernama = input.next();
                        Customer customerByNama = warehouse.sequentialSearchCustomerByNama(caricustomernama);
                        if (customerByNama != null) {
                        System.out.println("customer ditemukan: " + customerByNama.toString());
                        } else {
                        System.out.println("customer tidak ditemukan.");
                        }
                    break;

                    case 0:
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                    break;

                case 3:
                Menu.Suppliermenu();
                System.out.print("Masukkan pilihan: ");
                int supplierChoice = input.nextInt();
    
                switch (supplierChoice) {
                    case 1:
                        
                        System.out.print("Masukkan nama supplier: ");
                        String supplierNama = input.next();
                        System.out.print("Masukkan alamat supplier: ");
                        String supplierAlamat = input.next();
                        System.out.print("Masukkan nomor telepon supplier: ");
                        String supplierNomorTelepon = input.next();
                        System.out.print("Masukkan email supplier: ");
                        String supplierEmail = input.next();
                        System.out.print("Masukkan kategori supplier: ");
                        String supplierKategori = input.next();
                    
    
                        Supplier newSupplier = new Supplier(supplierNama, supplierAlamat, supplierNomorTelepon,
                                supplierEmail, supplierKategori);
                        warehouse.tambahSupplier(newSupplier);
                        System.out.println("Supplier berhasil ditambahkan.");
                        break;
    
                    case 2:
                        
                        System.out.println("=== List Supplier ===");
                        warehouse.lihatSupplier();
                        break;
    
                    case 3:
                       
                        System.out.print("Masukkan nama supplier yang ingin diupdate alamat: ");
                        String updateSupplierNama = input.next();
                        System.out.print("Masukkan alamat baru: ");
                        String newSupplierAlamat = input.next();
                        warehouse.updateSupplierEmail(updateSupplierNama, newSupplierAlamat);
                        break;
    
                    case 4:
                        
                        System.out.print("Masukkan nama supplier yang ingin dihapus: ");
                        String deleteSupplierNama = input.next();
                        warehouse.hapusSupplier(deleteSupplierNama);
                        break;

                    case 5: 
                        warehouse.simpanDataSupplierKeFile();
                        break;

                    case 6:
                        warehouse.bubbleSortSupplierByNama();
                        break;

                    case 7:
                        System.out.print("Masukkan nama supplier yang dicari: ");
                        String cariSupplierNama = input.next();
                        Supplier supplierByNama = warehouse.sequentialSearchSupplierByNama(cariSupplierNama);
                        if (supplierByNama != null) {
                        System.out.println("Supplier ditemukan: " + supplierByNama.toString());
                        } else {
                        System.out.println("Supplier tidak ditemukan.");
                        }
                    break;

                    case 0:
                        break;
    
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
    
                break;
                case 0:
                    System.out.println("Program selesai. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 0);
        input.close();
    }
}