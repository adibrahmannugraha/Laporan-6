package TUGAS1;

public class PegawaiTT extends Employee {

    private int LEMBUR, JAM;

    public PegawaiTT(int id, int masuk, String nama, String jabatan, String status, int anak, int jam) {
        super(id, masuk, nama, jabatan, status, anak);
        LEMBUR = 10000;
        JAM = jam;
    }

    public double Gaji() {
        if (JAM > 10) {
            return GAJI+(LEMBUR*(JAM-10));
        } else
            return GAJI;
    }
}
