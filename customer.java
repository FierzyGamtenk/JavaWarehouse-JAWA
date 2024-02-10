class Customer {
    String nama;
    double balance;
    String address;
    String phoneNumber;
    String birthdate;

    public Customer(String nama, double balance, String address, String phoneNumber, String birthdate) {
        this.nama = nama;
        this.balance = balance;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
    }
    
    public String toString() {
        return "Nama: " + nama + ", Balance: " + balance +
                ", Address: " + address + ", Phone Number: " + phoneNumber +
                ", Birthdate: " + birthdate;
    }
}