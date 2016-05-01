
package TUGAS1;

public class PegawaiT extends Employee {
    public PegawaiT(int id, int masuk, String nama, String jabatan, String status, int anak){
        super(id,masuk,nama,jabatan,status,anak);
    }
    public double Gaji() {
        TAHUN -= TAHUNMASUK;
        if (TAHUN > 10) {
            BONUS = 0.1 * (GAJI * TAHUN * 0.05);
            TUNJANGAN = 0.1 * (GAJI * TAHUN * 0.05);
        } else if (TAHUN > 5 && TAHUN < 11) {
            BONUS = 0.05 * (GAJI * TAHUN * 0.05);
        }

        if (STATUS.equalsIgnoreCase("Kawin")) {
            if (ANAK > 0 && ANAK < 4) {
                TUNJANGANKELUARGA = (0.1 * (GAJI + (GAJI * TAHUN * 0.05) + TUNJANGAN)) + (ANAK * (0.15 * (GAJI + (GAJI * TAHUN * 0.05) + TUNJANGAN)));
            } else if (ANAK > 3) {
                TUNJANGANKELUARGA = (0.1 * (GAJI + (GAJI * TAHUN * 0.05) + TUNJANGAN)) + (3 * (0.15 * (GAJI + (GAJI * TAHUN * 0.05) + TUNJANGAN)));
            } else {
                TUNJANGANKELUARGA = (0.1 * (GAJI + (GAJI * TAHUN * 0.05) + TUNJANGAN));
            }
        }
        return GAJI + BONUS + TUNJANGAN + TUNJANGANKELUARGA;
    }
}
