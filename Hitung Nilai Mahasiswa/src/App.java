import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data Mahasiswa
        System.out.print("Nama : ");
        String Nama = scanner.nextLine();
        System.out.print("NIM : ");
        String NIM = scanner.nextLine();

        // Input Nilai Mahasiswa
        System.out.println("\n~~~~~Masukkan Nilai Mahasiswa~~~~~");
        System.out.print("Masukan Nilai Tubes : ");
        double nilaiTubes = scanner.nextDouble();
        System.out.print("Masukan Nilai Quiz : ");
        double nilaiQuiz = scanner.nextDouble();
        System.out.print("Masukan Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Masukan Nilai UTS : ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        double nilaiUAS = scanner.nextDouble();

        // Menghitung Total Nilai
        double hasilNilai = (0.3 * nilaiTubes) + (0.1 * nilaiQuiz) + (0.1 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        // Menampilkan Output
        System.out.println("");
        System.out.println("Nama : " + Nama);
        System.out.println("NIM  : " + NIM);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + hasilNilai);

        scanner.close();
    }
}