
public class Kullanici {

    // kullanıcıya ait özellikleri private ettim 
    private String kullanici_adi;
    private String kullanici_soyadi;
    private String kullanici_parola;
    private String uyelik_tarihi;
    SepettekiUrun[] sepet; // Her kullanıcının kendisine ait bir sepete olacağı için buraya sepetteki ürünü çağırdım.
    int sepetIndex = 0; // 0 dan başlattım her ürün eklendiğinde artacak
    private Kullanici[] kullanicilar; // kullanıcı listesi
    private int kullanicilarIndex = 0;
    public boolean premiumKullanici = false; // normal kullanıcı olarak döndürücek bu true olduğunda premium kullanıcı olur
    public int alısverisSayisi;

// get ve set methodları
    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }

    private Double bakiye = 0.0;

    public String getKullanici_parola() {
        return kullanici_parola;
    }

    public void setKullanici_parola(String kullanici_parola) {
        this.kullanici_parola = kullanici_parola;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getKullanici_soyadi() {
        return kullanici_soyadi;
    }

    public void setKullanici_soyadi(String kullanici_soyadi) {
        this.kullanici_soyadi = kullanici_soyadi;
    }

    public String getUyelik_tarihi() {
        return uyelik_tarihi;
    }

    public void setUyelik_tarihi(String uyelik_tarihi) {
        this.uyelik_tarihi = uyelik_tarihi;
    }
// constructor yapısı

    public Kullanici(String kullanici_adi, String kullanici_soyadi, String kullanici_parola, String uyelik_tarihi, Double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.kullanici_soyadi = kullanici_soyadi;
        this.uyelik_tarihi = uyelik_tarihi;
        this.kullanici_parola = kullanici_parola;
        this.sepet = new SepettekiUrun[100];
        this.bakiye = bakiye;
        this.alısverisSayisi = 0;
    }
// kullanıcıya  ait bilgileri göster methodu

    public void bilgileriGoster() {

        System.out.println("");
        System.out.println("KULLANICI BİLGİLERİ");
        System.out.println("Kullanıcı Adı:" + kullanici_adi);
        System.out.println("Kullanıcı Soyadı:" + kullanici_soyadi);
        System.out.println("Kullanıcı Parola:" + kullanici_parola);
        System.out.println("Kullanıcının Üye Olduğu Tarih:" + uyelik_tarihi);
        System.out.println("");

    }

    public boolean sepeteEkle(Urun urun, int adet) {   // urun sayfası özelliklerini parametre olarak girdim kaç tane alacağını da adet olarak belirledim
        boolean sepetteMevcut = false; // false olarak dönücek
        for (int i = 0; i < sepetIndex; i++) { // sepetin içini dönücek
            if (sepet[i].getUrun().equals(urun)) {  // hangi ürünü seçicek
                if (urun.getUrununStokAdedi() < adet) { // adet sayısından fazlaysa tekrar isticek
                    System.out.println("ÜRÜNÜN STOK ADEDI YETERSIZ.");
                    return false;
                } else {
                    sepet[i].setAdet(sepet[i].getAdet() + adet);  // set dedik kullanıcı belirticek adet sayısını seçtikten sonra sepete o kadar gelicek
                    urun.setUrununStokAdedi(urun.getUrununStokAdedi() - adet);
                    System.out.println("ÜRÜN SEPETİNİZE EKLENDİ");
                    return true;
                }
            }
        }
        if (!sepetteMevcut) {
            if (urun.getUrununStokAdedi() < adet) {
                System.out.println("ÜRÜNÜN STOK ADEDI YETERSIZ."); // bunu da eğer tekrardan mevcutsa tekrar almak isteyebilir
                return false;
            } else {
                sepet[sepetIndex] = new SepettekiUrun(urun, adet);
                sepetIndex += 1;
                urun.setUrununStokAdedi(urun.getUrununStokAdedi() - adet);
                System.out.println("ÜRÜN SEPETİNİZE EKLENDİ");
                return true;
            }
        }
        return true;
    }

    public void sepetUrunCikart(Urun urun) { // kullanıcı sepette istediği ürünü çıkarmat için gereken methodu yazdum
        for (int i = 0; i < sepetIndex; i++) { // sepetin içindeki index uzunluğunda dönecek
            if (sepet[i].getUrun().equals(urun)) { // eşit olacak
                sepet[i].setAdet(0); // sıfırlanacak

                urun.setUrununStokAdedi(urun.getUrununStokAdedi() + sepet[i].getAdet()); // ürünün stok adedine tekrar geri giricek
                sepet[i] = null;
            }
            
        }
        sepetIndex--; // birer birer azaltır
    }

    public void sepetTemizle() { // aktif olan kullınıcı işlemi yaptıktan sonra sepetin temizlenmesi için sepeti sıfırladım
        for (int i = 0; i < sepetIndex; i++) {
            sepet[i].setAdet(0);
        }
    }

    public void sepetUrunEksilt(Urun urun, int adet) {
        for (int i = 0; i < sepetIndex; i++) {
            if (sepet[i].getUrun().equals(urun)) {
                int yeniAdet = sepet[i].getAdet() - adet;
                if (yeniAdet < 0) {
                    yeniAdet = 0;
                }
                sepet[i].setAdet(0);
                urun.setUrununStokAdedi(urun.getUrununStokAdedi() + adet);
            }
        }
    }

    public Double sepetTutariHesapla() { // normal kullanıcı için ödeme methodu
        Double sepetTutari = 0.0;
        for (int i = 0; i < this.sepetIndex; i++) {
            sepetTutari += (this.sepet[i].getAdet() * this.sepet[i].getUrun().getUrununFiyati());
        }
        return sepetTutari;
    }

}
