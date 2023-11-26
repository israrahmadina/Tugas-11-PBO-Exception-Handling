import java.util.Scanner;

public class app {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       try {
        System.out.print("Masukkan No Faktur: ");
        String noFaktur = scanner.nextLine();

        System.out.print("Masukkan Nama Pembeli: ");
        String namaPembeli = scanner.nextLine();

        System.out.print("Masukkan Nama Produk yang akan dibeli: ");
        String namaProduk = scanner.nextLine();

        System.out.print("Masukkan Harga Produk yang dibeli: ");
        double hargaProduk = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Barang yang diBeli: ");
        int jumlahBeli = scanner.nextInt();

        // Membuat objek dari kelas PembelianBarang
        pembelianProduk pembelian = new  pembelianProduk (noFaktur, namaPembeli, namaProduk, hargaProduk, jumlahBeli);

        // Menampilkan informasi pembelian
        pembelian.tampilkanInfo();
       } catch (Exception e){
        System.out.println("-----------------------------------------");
        System.out.println(" Mohon Maaf Telah Terjadi kesalahan: " + e.getMessage());
       } finally {
        scanner.close();
       }
    }
}