package repository;

import model.Mahasiswa;

public class MahasiswaTbl {
    private Database db;

    public MahasiswaTbl(Database db) {
        this.db = db;
    }

    public void create(Mahasiswa mahasiswa) {
        for (int i = 0; i < db.tables.dataProdi.size(); i++) {
            if (db.tables.dataProdi.get(i).getId().equals(mahasiswa.getProdi())) {
                db.tables.dataMahasiswa.add(mahasiswa);
                db.commit();
                return;
            }
        }
        System.out.println("Data tidak Ditemukan");
    }

    public void update(String nim, Mahasiswa mahasiswa) {
        boolean kondisi1 = false;

        for (int i = 0; i < db.tables.dataMahasiswa.size(); i++) {
            if (db.tables.dataMahasiswa.get(i).getNim().equals(nim)) {
                kondisi1 = true;
            }
        }
        if (kondisi1) {
            for (int i = 0; i < db.tables.dataProdi.size(); i++) {
                if (db.tables.dataProdi.get(i).getId().equals(mahasiswa.getProdi())) {
                    db.tables.dataMahasiswa.set(i, mahasiswa);
                    db.commit();
                    return;
                }
            }
            System.out.println("Data tidak Ditemukan");
        }
    }

    public Mahasiswa getMahasiswaByNim(String nim) {
        for (int i = 0; i < db.tables.dataMahasiswa.size(); i++) {
            if (db.tables.dataMahasiswa.get(i).getNim().equals(nim)) {
                return db.tables.dataMahasiswa.get(i);
            }
        }
        return null;
    }

    public void delete(String nim) {
        for (int i = 0; i < db.tables.dataMahasiswa.size(); i++) {
            if (db.tables.dataMahasiswa.get(i).getNim().equals(nim)) {
                db.tables.dataMahasiswa.remove(i);
                break;
            }
        }
        db.commit();
    }
}
