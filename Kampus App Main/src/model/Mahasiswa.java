package model;

public class Mahasiswa {
    private String nim;
    private String prodi;
    private String nama;

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
}
