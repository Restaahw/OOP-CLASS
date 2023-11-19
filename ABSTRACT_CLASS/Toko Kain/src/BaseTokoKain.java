public abstract class BaseTokoKain {
    public String jenisKain;
    public String gradeKain;
    public int hargaKain;
    public int quantityKain;

    public void caraPembayaran() {
        System.err.println("Silahkan pilih cara pembayaran Cash / Debit");
    }
    public abstract void Bahan();
}
