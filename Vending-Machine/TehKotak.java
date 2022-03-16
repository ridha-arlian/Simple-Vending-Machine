import java.util.Scanner;
public class TehKotak implements Pembayaran {
    public void BayarMinum() {
        Scanner UangPelanggan = new Scanner(System.in);
        String rupiah = "4000";

        System.out.print("Masukkan Uang Pas: ");
        rupiah = UangPelanggan.nextLine();

        if(rupiah.equals("4000")){
            System.out.println("Jumlah uang yang anda masukkan cukup, minuman akan segera keluar. \n");
            System.out.println("Silahkan Tunggu");
        } else {
        System.out.println("Uang yang anda masukkan kurang atau tidak sesuai");
        }
    }
}
