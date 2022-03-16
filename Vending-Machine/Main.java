import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Fanta AirFanta = new Fanta();
        TehKotak AirTehKotak = new TehKotak();
        Chimory AirChimory = new Chimory();

        Uang PembayaranFanta = new Uang();
        Uang PembayaranTehKotak = new Uang();
        Uang PembayaranChimory = new Uang();

        Scanner saldoMembayar = new Scanner(System.in);
        System.out.println("\tPilih minuman yang diinginkan");
        System.out.println("\t1. Fanta - Rp.5.000");
        System.out.println("\t2. Teh Kotak - Rp.4.000");
        System.out.println("\t3. Chimory - Rp.10.000\n");
        System.out.print("Pilihan: ");

        int pilihan = saldoMembayar.nextInt();
        switch (pilihan) {
            case 1:
                PembayaranFanta.InsertTo(AirFanta);
                PembayaranFanta.Membayar();
                break;
            
            case 2:
                PembayaranTehKotak.InsertTo(AirTehKotak);
                PembayaranTehKotak.Membayar();
                break;

            case 3:
                PembayaranChimory.InsertTo(AirChimory);
                PembayaranChimory.Membayar();
                break;
        
            default:
                System.out.println("\nPilihan Yang Anda Masukkan tidak tersedia\n");
                break;
        }
    }
}