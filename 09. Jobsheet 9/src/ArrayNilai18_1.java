import java.util.Scanner;

public class ArrayNilai18_1 {
    public static void main(String[] args) {
        
        Scanner sc18 = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc18.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak lulus!");
            }
        }

    }
}
