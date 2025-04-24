
public class Urun {
// ürüne ait özellikler
    private String urununAdi;
    private String urununRengi;
    private String urununMarkasi;
    private String urununBedeni;
    private int urununStokAdedi;
    private int urununFiyati;
    private int urunNumarası;

    public int getUrunNumarası() {
        return urunNumarası;
    }

    public void setUrunNumarası(int urunNumarası) {
        this.urunNumarası = urunNumarası;
    }

    public int getUrununFiyati() {
        return urununFiyati;
    }

    public void setUrununFiyati(int urununFiyati) {
        this.urununFiyati = urununFiyati;
    }

    public String getUrununAdi() {
        return urununAdi;
    }

    public void setUrununAdi(String urununAdi) {
        this.urununAdi = urununAdi;
    }

    public String getUrununRengi() {
        return urununRengi;
    }

    public void setUrununRengi(String urununRengi) {
        this.urununRengi = urununRengi;
    }

    public String getUrununMarkasi() {
        return urununMarkasi;
    }

    public void setUrununMarkasi(String urununMarkasi) {
        this.urununMarkasi = urununMarkasi;
    }

    public String getUrununBedeni() {
        return urununBedeni;
    }

    public void setUrununBedeni(String urununBedeni) {
        this.urununBedeni = urununBedeni;
    }

    public int getUrununStokAdedi() {
        return urununStokAdedi;
    }

    public void setUrununStokAdedi(int urununStokAdedi) {
        this.urununStokAdedi = urununStokAdedi;
    }
//  constructor yapısı
    public Urun(String urununAdi, String urununRengi, String urununMarkasi, String urununBedeni, int urununStokAdedi, int urununFiyati, int urunNumarası) {
        this.urununAdi = urununAdi;
        this.urununRengi = urununRengi;
        this.urununMarkasi = urununMarkasi;
        this.urununBedeni = urununBedeni;
        this.urununStokAdedi = urununStokAdedi;
        this.urununFiyati = urununFiyati;
        this.urunNumarası = urunNumarası;

    }
// ürün bilgilerini gösteren method
    public void bilgileriGöster() {

        System.out.println("ÜRÜN BİLGİLERİ");
        System.out.println("Ürün Adı: " + urununAdi);
        System.out.println("Ürünün Rengi: " + urununRengi);
        System.out.println("Ürünün Markası: " + urununMarkasi);
        System.out.println("Ürününün Bedeni: " + urununBedeni);
        System.out.println("Ürününün Fiyatı: " + urununFiyati);
        System.out.println("Ürünün Stok Adedi: " + urununStokAdedi);
        System.out.println("Ürünün Numarası: " + urunNumarası);
        System.out.println("");

    }

}
