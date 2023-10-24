import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        
        Scanner sc18 = new Scanner(System.in);

        int[] nilaiMahasiswa = new int[10];
        double total = 0, rata_rata;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa[i] = sc18.nextInt();
        }

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }

        rata_rata = total / nilaiMahasiswa.length;
        System.out.println("Rata-rata Nilai = " + rata_rata);

    }
}
