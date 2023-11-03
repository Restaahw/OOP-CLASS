import java.util.Scanner;

import model.Mahasiswa;
import model.Prodi;
import repository.Database;

public class KampusApp {
    public static void main(String[] arg) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database db;

    public KampusApp() {
        scanner = new Scanner(System.in);
        db = new Database();
    }

    public void showMenu() {
        System.out.println("---------------------------------");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tambah Data Prodi");
        System.out.println("6 -> Ubah Data Prodi");
        System.out.println("7 -> Hapus Data Prodi");
        System.out.println("8 -> Cari Data Prodi");
        System.out.println("0 -> Exit");
        System.out.print("Silahkan masukan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();
        switch (menuYangDipilih) {
            case 1:
                menuTambah();
                break;
            case 2:
                menuUbah();
                break;
            case 3:
                menuHapus();
                break;
            case 4:
                menuCari();
                break;
            case 5:
                menuTambahProdi();
                break;
            case 6:
                menuUbahProdi();
                break;
            case 7:
                menuHapusProdi();
                break;
            case 8:
                menuCariProdi();
                break;
            default: {
                System.out.print("* Terimakasih sudah menggunakan Aplikasi Kampus App *");
                System.exit(0);
            }
                break;
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Data Mahasiswa -----");
        System.out.print("Masukan Nama: ");
        String nim = scanner.nextLine();
        System.out.print("Masukan NIM: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Prodi ID: ");
        String prodi = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, prodi);
        db.mahasiswaTbl.create(mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah() {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukan NIM: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan ID prodi: ");
        String prodi = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, prodi);
        db.mahasiswaTbl.update(nimLama, mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = db.mahasiswaTbl.getMahasiswaByNim(nim);
        if (mahasiswa == null) {
            System.out.println("* NIM tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapus() {
        System.out.println("----- Menu Hapus Data Mahasiswa -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        db.mahasiswaTbl.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTambahProdi() {
        System.out.println("----- Menu Tambah Prodi -----");
        System.out.print("Masukan ID: ");
        String id = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        Prodi prodi = new Prodi(id, nama);
        db.prodiTbl.create(prodi);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbahProdi() {
        System.out.println("----- Menu Ubah Data Prodi -----");
        System.out.print("Masukan ID Sebelumnya: ");
        String idLama = scanner.nextLine();
        System.out.print("Masukan ID: ");
        String idBaru = scanner.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        Prodi prodi = new Prodi(idBaru, nama);
        db.prodiTbl.update(idLama, prodi);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCariProdi() {
        System.out.println("----- Menu Cari Data Prodi -----");
        System.out.print("Masukan ID: ");
        String id = scanner.nextLine();
        Prodi prodi = db.prodiTbl.getProdiById(id);
        if (prodi == null) {
            System.out.println("* ID tidak ditemukan *");
        } else {
            System.out.println("* ID: " + prodi.getId() + " *");
            System.out.println("* Nama: " + prodi.getNama() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapusProdi() {
        System.out.println("----- Menu Hapus Data Prodi -----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        db.mahasiswaTbl.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
}