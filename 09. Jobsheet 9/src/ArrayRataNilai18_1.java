import java.util.Scanner;

public class ArrayRataNilai18_1 {
    public static void main(String[] args) {
        
        Scanner sc18 = new Scanner(System.in);
        
        int jumlahLulus = 0, jumlahTidakLulus = 0, NilaiLulus = 0, NilaiTidakLulus = 0;
        double rerataNilaiLulus = 0, rerataNilaiTidakLulus = 0;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc18.nextInt();
        int[] nilaiAkhir = new int[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Akhir Mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc18.nextInt();

            if (nilaiAkhir[i] > 70) {
                NilaiLulus += nilaiAkhir[i];
                jumlahLulus++;
            } else {
                NilaiTidakLulus += nilaiAkhir[i];
                jumlahTidakLulus++;
            }
        }

        System.out.println("");
        System.out.println("Jumlah Mahasiswa Lulus : " + jumlahLulus);

        if (jumlahLulus > 0) {
            rerataNilaiLulus = (double) NilaiLulus / jumlahLulus;
        }

        if (jumlahTidakLulus > 0) {
            rerataNilaiTidakLulus = (double) NilaiTidakLulus / jumlahTidakLulus;
        }

        System.out.println("\nRata-rata Nilai Lulus : " + rerataNilaiLulus);
        System.out.println("Rata-rata Nilai Tidak Lulus : " + rerataNilaiTidakLulus);
    }
}
