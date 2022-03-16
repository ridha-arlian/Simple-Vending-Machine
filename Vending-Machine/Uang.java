public class Uang {
    private Pembayaran uang;

    public Uang() {
        uang = null; 
    }
    
    public void InsertTo(Pembayaran SaldoMembayar) {
        uang = SaldoMembayar;
    }
    
    public void Membayar() {
        if(uang != null) {
            uang.BayarMinum();
        }
        else {
            System.out.println("Uang yang anda masukkan tidak sesuai");
        }
    }   
}