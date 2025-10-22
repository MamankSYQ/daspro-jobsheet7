import java.util.Scanner;
public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <=10;i++){
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();

            if (nilai >= 60){
                lulus++;
            }
            else if (nilai < 60){
                tidakLulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus : " + tidakLulus);
    }
}