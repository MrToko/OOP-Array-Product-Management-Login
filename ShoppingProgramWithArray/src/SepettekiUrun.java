

public class SepettekiUrun {

    private Urun urun; // sepetteki ürünleri urun sayfasından çağırdım çünkü sepette ürünler olur 
    private int adet; // kaç adet olacağını belirten özellik

    public Urun getUrun() { // get ve set methodaları
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }
// constructor yapısı
    public SepettekiUrun(Urun urun, int adet) {
        this.urun = urun;
        this.adet = adet;
    }

}
