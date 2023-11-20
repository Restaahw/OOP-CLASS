public class Main {
    public static void main(String[] args) throws Exception {
        KainBaju Cust1 = new KainBaju();
        Cust1.jenisKain = "Rayon";
        Cust1.gradeKain = "C";
        Cust1.hargaKain = 75000;
        Cust1.quantityKain = 85;

        KainCelana Cust2 = new KainCelana();
        Cust2.jenisKain = "CT";
        Cust2.gradeKain = "B";
        Cust2.hargaKain = 85000;
        Cust2.quantityKain = 25;

        KainBendera Cust3 = new KainBendera();
        Cust3.jenisKain = "Parasit";
        Cust3.gradeKain = "A";
        Cust3.hargaKain = 20000;
        Cust3.quantityKain = 15;
        
        Cust1.Bahan();
        Cust1.PembayaranKainBaju();
        Cust1.caraPembayaran();
        
        Cust2.Bahan();
        Cust2.PembayaranKainCelana();
        Cust2.caraPembayaran();

        Cust3.Bahan("Merah Putih");
        Cust3.PembayaranKainBendera();
        Cust3.caraPembayaran();

        BaseTokoKain [] list = new BaseTokoKain[3];
        list[0] = new KainBendera();
        list[1] = new KainCelana();

        list[0].Bahan();
        list[1].Bahan();
    }
}
