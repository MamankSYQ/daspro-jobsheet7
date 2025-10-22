import java.util.Scanner;
public class TugasNo1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlPelanggan, jmlTiket;
        double totHarga;
        double totPenjualan = 0;
        int totTiket = 0;
        double hargaTiket = 50000;

        System.out.print("Masukkan jumlah pelanggan : ");
        jmlPelanggan = sc.nextInt();

        for (int i = 1; i <= jmlPelanggan; i++) {
            System.out.print("Masukkan jumlah tiket untuk pelanggan ke-" + i + ": ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }
            else if (jmlTiket == 0) {
                System.out.println("Perhitungan selesai.");
                break;
            }

            
            if (jmlTiket > 10){
                totHarga = (int)(hargaTiket * jmlTiket * 0.85);
                totPenjualan += totHarga;
                totTiket += jmlTiket;
            }
            else if (jmlTiket > 4){
                totHarga = (int)(hargaTiket * jmlTiket * 0.9);
                totPenjualan += totHarga;
                totTiket += jmlTiket;
            }
            else {
                totHarga = hargaTiket * jmlTiket;
                totPenjualan += totHarga;
                totTiket += jmlTiket;
            }
        }
        System.out.println("Total penjualan tiket selama satu hari adalah Rp." + totPenjualan);
        System.out.println("Jumlah tiket yang dijual selama satu hari " + totTiket);
    }    
}
