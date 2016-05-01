package TUGAS1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        int input;
        int id, masuk, anak, jam;
        String nama, jabatan, status;
        System.out.println("                         PT.LABKOMDAS");
        System.out.println("             SELAMAT DATANG DI PROGRAM GAJI PEGAWAI");
        System.out.println("\nTEKAN 1 UNTUK MELIHAT TOTAL GAJI PEGAWAI\nTEKAN 2 UNTUK MENGAKHIRI PROGRAM");
        while (menu) {
            System.out.print("MENU : ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("\n                      SILAHKAN ISI BIODATA\n");
                    System.out.print("Nama              : ");
                    nama = scan.nextLine();
                    nama = scan.nextLine();
                    System.out.print("Id Kerja          : ");
                    id = scan.nextInt();
                    System.out.print("Jabatan(M/PT/PTT) : ");
                    jabatan = scan.nextLine();
                    jabatan = scan.nextLine();
                    System.out.print("Tahun Masuk       : ");
                    masuk = scan.nextInt();
                    System.out.print("Status Perkawinan : ");
                    status = scan.nextLine();
                    status = scan.nextLine(); 
                    System.out.print("Jumlah Anak       : ");
                    anak = scan.nextInt();
                    switch (jabatan) {
                        case "M":
                            System.out.println("\n                  PERMINTAAN SEDANG DIPROSES\n");
                            Manager M = new Manager(id, masuk, nama, "Manager", status, anak);
                            M.Biodata();
                            System.out.println("Total Gaji        : Rp. "+M.Gaji());
                            break;
                        case "PT":
                            System.out.println("\n                  PERMINTAAN SEDANG DIPROSES\n");
                            PegawaiT PT = new PegawaiT(id, masuk, nama, "Pegawai Tetap", status, anak);
                            PT.Biodata();
                            System.out.println("Total Gaji        : Rp. "+PT.Gaji());
                            break;
                        case "PTT":
                            System.out.print("Jam Lembur        :");
                            jam = scan.nextInt();
                            System.out.println("\n                  PERMINTAAN SEDANG DIPROSES\n");
                            PegawaiTT PTT = new PegawaiTT(id, masuk, nama, "Pegawai Tidak Tetap", status, anak, jam);
                            PTT.Biodata();
                            System.out.println("Total Gaji        : Rp. "+PTT.Gaji());
                            break;
                    }
                case 2:
                    menu = false;
                    System.out.println("\n                  PROGRAM SELESAI DIJALANKAN");
                    System.out.println("                         TERIMA KASIH");
                    break;
            }
        }
    }
}
