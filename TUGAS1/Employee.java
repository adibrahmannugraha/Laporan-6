package TUGAS1;

public class Employee {

    protected String NAMA, JABATAN, STATUS;
    protected int TAHUNMASUK, TAHUN, IDKERJA, ANAK;
    protected double GAJI, BONUS, TUNJANGAN,TUNJANGANKELUARGA;
    
    public Employee(int id, int masuk, String nama, String jabatan, String status, int anak) {
        IDKERJA = id;
        TAHUNMASUK = masuk;
        NAMA = nama;
        JABATAN = jabatan;
        STATUS = status;
        ANAK = anak;
        TAHUN = 2016;
        GAJI = 2000000;
        BONUS = 0;
        TUNJANGAN = 0;
        TUNJANGANKELUARGA = 0;
    }

    public void Biodata() {
        System.out.println("Nama              : " + NAMA);
        System.out.println("Id Kerja          : " + IDKERJA);
        System.out.println("Jabatan           : " + JABATAN);
        System.out.println("Tahun Masuk       : " + TAHUNMASUK);
        System.out.println("Status Perkawinan : " + STATUS);
        System.out.println("Jumlah Anak       : " + ANAK);
    }
}
