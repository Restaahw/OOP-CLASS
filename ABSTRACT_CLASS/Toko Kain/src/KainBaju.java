public class KainBaju extends BaseTokoKain{

    @Override
    public void Bahan() {
        System.out.println("Jenis bahan kain baju yang kamu pilih adalah " + jenisKain + " grade " + gradeKain + " dengan harga " + hargaKain + " sebanyak " + quantityKain + "KG");
    }
    
    public void PembayaranKainBaju() {
        System.out.println("Dan total yang harus kamu bayar sebesar " + hargaKain*quantityKain );
    }
}
