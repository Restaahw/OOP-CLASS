public class KainBendera extends BaseTokoKain{

    @Override
    public void Bahan() {
        System.out.println("Jenis bahan kain bendera yang kamu pilih adalah " + jenisKain + " grade " + gradeKain + " dengan harga " + hargaKain + " sebanyak " + quantityKain + "KG");
    }
    //menambahkan overloading 
    public void Bahan(String warna) {
        System.out.println("Jenis bahan kain bendera yang kamu pilih adalah " + jenisKain + " grade " + gradeKain + " dengan harga " + hargaKain + " sebanyak " + quantityKain + "KG" +"dengan warna " + warna);
    }

        public void PembayaranKainBendera() {
        System.out.println("Dan total yang harus kamu bayar sebesar " + hargaKain*quantityKain );
    }
    
    @Override
    public void caraPembayaran() {
        super.caraPembayaran();
        System.out.println("Jika anda ingin melakukan pembayaran dengan kartu debit mohon untuk Transfer Ke Rekening BCA 2831999777 AN RESTA AUZAN ");
    }
}
