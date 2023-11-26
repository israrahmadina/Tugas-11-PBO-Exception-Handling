// Kelas turunan yang mengimplementasikan interface TotalBayar
public class pembelianProduk extends pembelian implements TotalBayar {
  
    public pembelianProduk (String noFaktur, String namaPembeli, String namaProduk, double hargaProduk, int jumlahBeli){
        super (noFaktur, namaPembeli, namaProduk, hargaProduk, jumlahBeli);
    }

    // Implementasi metode dari interface TotalBayar
    @Override
    public double hitungTotalBayar(){
        return hargaProduk * jumlahBeli; 
    }

    // Override metode tampilkanInfo untuk menampilkan total bayar
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Total Bayar: " + hitungTotalBayar());
    }
}