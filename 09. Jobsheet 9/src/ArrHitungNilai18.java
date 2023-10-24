import java.util.Scanner;

public class ArrHitungNilai18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        int highestElement = Integer.MIN_VALUE, lowestElement = Integer.MAX_VALUE, totalValue = 0;
        double averageElement = 0;
        
        System.out.print("Masukkan Jumlah Mahasiswa       : ");
        int totalElement = sc18.nextInt();
        int elementValue[] = new int[totalElement];

        for (int i = 0; i < totalElement; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + "   : ");
            elementValue[i] = sc18.nextInt();

            totalValue += elementValue[i];
            if (elementValue[i] > highestElement) {
                highestElement = elementValue[i];
            }
            if (elementValue[i] < lowestElement) {
                lowestElement = elementValue[i];
            }

            
        }
        
        System.out.println("Nilai Tertinggi Adalah          : " + highestElement);
        System.out.println("Nilai Terrendah Adalah          : " + lowestElement);
        
        averageElement = (double) totalValue / totalElement;
        System.out.println("Rata-rata Nilai                 : " + averageElement);
    }
}
