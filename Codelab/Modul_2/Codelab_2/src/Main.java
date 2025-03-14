public class Main {
    public static void main(String[]args) {
        //Membuat objek rekening 1 dan rekening 2
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110498";
        rekening2.nomorRekening = "202410370110527";

        rekening1.namaPemilik = "Rushtam";
        rekening2.namaPemilik = "Rohid";

        rekening1.saldo = 300000.0;
        rekening2.saldo = 500000.0;

        //Menampilkan informasi rekening sebelum transaksi
        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        //Melakukan transaksi
        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);

        //Menampilkan info setelah transaksi
        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}