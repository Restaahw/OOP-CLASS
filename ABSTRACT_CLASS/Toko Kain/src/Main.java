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
        
        Cust1.Bahan();
        Cust1.PembayaranKainBaju();

        Cust2.Bahan();
        Cust2.PembayaranKainBaju();
    }
}
