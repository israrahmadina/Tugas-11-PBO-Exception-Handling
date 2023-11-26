public class pembelian {
    protected String noFaktur;
    protected String namaPembeli;
    protected String namaProduk;
    protected double hargaProduk;
    protected int jumlahBeli;

    public pembelian(String noFaktur, String namaPembeli, String namaProduk, double hargaProduk, int jumlahBeli){
        this.noFaktur = noFaktur;
        this.namaPembeli = namaPembeli;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanInfo(){
        System.out.println("-----------------------------");
        System.out.println("No Faktur: "+ noFaktur);
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: " + hargaProduk);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("-------------------------------");
        System.out.println(" Terimakasih "+ namaPembeli);
    }
}