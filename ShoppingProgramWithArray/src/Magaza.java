
public class Magaza {
// mağazaya ait olacak özellikleri privae ettim
    private String magaza_adi;
    private String magaza_adresi;
    private double takipci_sayisi;
    private double satıs_sayisi;
    private int calısan_sayisi;
    private double begeniSayisi;

    Urun[] urunler; // mağazanın ürünleri olacağı için urun sayfasını çağırdım
    int urunlerIndex = 0;
    
// get ve set methodları
    public String getMagaza_adi() {
        return magaza_adi;
    }

    public int getCalısan_sayisi() {
        return calısan_sayisi;
    }

    public void setCalısan_sayisi(int calısan_sayisi) {
        this.calısan_sayisi = calısan_sayisi;
    }

    public void setMagaza_adi(String magaza_adi) {
        this.magaza_adi = magaza_adi;
    }

    public String getMagaza_adresi() {
        return magaza_adresi;
    }

    public void setMagaza_adresi(String magaza_adresi) {
        this.magaza_adresi = magaza_adresi;
    }

    public double getTakipci_sayisi() {
        return takipci_sayisi;
    }

    public void setTakipci_sayisi(int takipci_sayisi) {
        this.takipci_sayisi = takipci_sayisi;
    }

    public double getSatıs_sayisi() {
        return satıs_sayisi;
    }

    public void setSatıs_sayisi(int satıs_sayisi) {
        this.satıs_sayisi = satıs_sayisi;
    }
    
     public double getBegeniSayisi() {
        return begeniSayisi;
    }

    public void setBegeniSayisi(double begeniSayisi) {
        this.begeniSayisi = begeniSayisi;
    }
// constructor yapısı
    public Magaza(String magaza_adi, String magaza_adresi, int takipci_sayisi, int satıs_sayisi, int calısan_sayisi, double begeniSayisi) {
        this.magaza_adi = magaza_adi;
        this.magaza_adresi = magaza_adresi;
        this.takipci_sayisi = takipci_sayisi;
        this.satıs_sayisi = satıs_sayisi;
        this.calısan_sayisi = calısan_sayisi;
        this.urunler = new Urun[1000];
        this.begeniSayisi = begeniSayisi;

    }

   
// mağazaya ait olan bilgileri gösteren method
    public void bilgileriGoster() {

        System.out.println("MAĞAZA BİLGİLERİ");
        System.out.println("Mağaza Adı: " + magaza_adi);
        System.out.println("Mağaza Adresi: " + magaza_adresi);
        System.out.println("Mağazanın Takipçi Sayısı: " + takipci_sayisi);
        System.out.println("Mağazada Yapılan Satış Sayısı: " + satıs_sayisi);
        System.out.println("Mağazada Çalışan Kişi Sayısı: " + calısan_sayisi);
        System.out.println("Mağazanın Beğeni Sayısı: " + begeniSayisi);
        System.out.println("");

    }

    public void urunEkle(Urun urun) { // urun listesi var ürün eklediğini gösteren method 

        this.urunler[urunlerIndex] = urun; // urunler bir arraydir içinde urunlerındex kadar olacak ve eklencek
        this.urunlerIndex += 1;

    }

    public Urun[] magazadakiUrunTurleri() {
        // this.urunler = [pant, pant, pant, mont, mont]
        // urunler = [<pant>, <mont>] urunler[1] -> mont
        // 1. Pantolon
        // 2. Mont

        Urun[] urunTurleri = new Urun[100]; // 
        int geciciUrunlerIndex = 0; // 
        for (int i = 0; i < this.urunlerIndex; i++) {
            boolean icerir = false; // tek tek bakıyor ürüntürlerindeki listeye ekliyor bi daha görünce eklemiyor
            Urun urun = this.urunler[i];

            for (int j = 0; j < geciciUrunlerIndex; j++) {
                if (urunTurleri[j].getUrununAdi().equals(urun.getUrununAdi())) {
                    icerir = true;
                }
            }
            if (!icerir) {
                urunTurleri[geciciUrunlerIndex] = urun;
                geciciUrunlerIndex += 1;
            }
        }
        return urunTurleri;
    }

    public void magazadakiUrunTurleriGoster() {

        Urun[] urunTurleri = magazadakiUrunTurleri();
        for (int i = 1; i < urunTurleri.length + 1; i++) {
            if (urunTurleri[i - 1] != null) {  // 
                System.out.println(i + ". " + urunTurleri[i - 1].getUrununAdi());
            }
        }
    }
}
