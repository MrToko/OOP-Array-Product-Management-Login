
import java.util.Scanner;

public class Sistem {
// burada kendime ait bir sistem oluştudum uygulama gibi bütün sayfaları buraya çağırdım burada işlem yapacağız

    private Urun[] urunler;
    private Magaza[] magazalar;
    private int magazalarIndex = 0;
    public Kullanici[] kullanicilar;
    public int kullanicilarIndex = 0;
    private KullaniciLogin login;
    private Kullanici aktifKullanici; // aktif kullanıcı yaptım çünkü her kullanıcıya göre işlemler var mesela sepet işlemleri

    public void magazaEkle(Magaza magaza) { // mağaza ekle her mağaza oluşturduğunda mağaza ekleyerek liste oluşturuyoruz
        this.magazalar[magazalarIndex] = magaza;
        magazalarIndex += 1;
    }

    public void kullaniciEkle(Kullanici kullanici) { // kullanıcı ekle kullanıcı listesi 
        this.kullanicilar[kullanicilarIndex] = kullanici;
        kullanicilarIndex += 1;
    }

    public void kullanicilariListele() { // bastırdım
        for (int i = 0; i < kullanicilarIndex + 1; i++) {
            System.out.println(i + "." + kullanicilar[i - 1].getKullanici_adi());
        }
    }

    public void magazalariListele() { // bastırdım
        for (int i = 1; i < magazalarIndex + 1; i++) {
            System.out.println(i + ". " + magazalar[i - 1].getMagaza_adi());
        }
    }

    public Sistem() {
// burada belirttik arrayleri
        kullanicilar = new Kullanici[10]; 
        magazalar = new Magaza[100];
        login = new KullaniciLogin(this);

        kullaniciEkle(new Kullanici("eymen", "TOK", "2", "23.02.2008", 100000.0));
        kullaniciEkle(new Kullanici("emirhan", "TOK", "1", "23.09.2002", 1000.0));
        kullaniciEkle(new PremiumKullanici("safa", "tok", "1", "23.22.2000", 33000.0));
        kullaniciEkle(new PremiumKullanici("oguzhan", "TOK", "61", "01.08.1998", 45000.0));
        kullaniciEkle(new Kullanici("serpil", "tok", "2", "23.04.2002", 200.0));
        kullaniciEkle(new Kullanici("efe", "gedikoglu", "61", "10.07.2008", 10000.0));

        Magaza boyner = new Magaza("BOYNER", "Başakşehir / İstanbul Mall OF Istanbul", 2000, 7532, 25, 700);
        magazaEkle(boyner);

        boyner.urunEkle(new Urun("PANTOLON", "SİYAH", "MAVİ", " 32 34", 4, 500, 1));

        boyner.urunEkle(new Urun("PANTOLON", "SİYAH", "MAVİ", " 34 36", 3, 600, 2));

        boyner.urunEkle(new Urun("PANTOLON", "SİYAH", "MAVİ", " 36 38", 6, 700, 3));

        boyner.urunEkle(new Urun("MONT", "LACİVERT", "NIKE", "L", 12, 750, 4));

        boyner.urunEkle(new Urun("MONT", "LAVİVERT", "NIKE", "M", 9, 850, 5));

        boyner.urunEkle(new Urun("MONT", "LACİVERT", "NIKE", "S", 5, 950, 6));

        boyner.urunEkle(new Urun("AYAKKABI", "YEŞİL", "PUMA", "37 - 48 NUMARA", 6, 830, 7));

        boyner.urunEkle(new Urun("AYAKKABI", "SİYAH", "PUMA", "38 - 46 NUMARA", 3, 830, 8));

        boyner.urunEkle(new Urun("AYAKKABI", "BORDO", "ADİDAS", "39 - 45 NUMARA", 7, 960, 9));

        boyner.urunEkle(new Urun("AYAKKABI", "BEYAZ", "KİNETİX", "40-47 NUMARA", 3, 545, 10));

        Magaza pullAndBear = new Magaza("PULL AND BEAR", "Avcılar / İstanbul Akbatı", 1542, 5234, 18, 500);
        magazaEkle(pullAndBear);

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "GRİ", "PULL AND BEAR", "SMALL", 3, 450, 11));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "GRİ", "PULL AND BEAR", "MEDIUM", 4, 470, 12));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "GRİ", "PULL AND BEAR", "LARGE", 5, 490, 13));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "SİYAH", "PULL AND BEAR", "SMALL", 5, 450, 14));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "SİYAH", "PULL AND BEAR", "MEDIUM", 4, 470, 15));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "SİYAH", "PULL AND BEAR", "LARGE", 3, 490, 16));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "KOYU YEŞİL", "PULL AND BEAR", "SMALL", 6, 390, 17));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "KOYU YEŞİL", "PULL AND BEAR", "MEDIUM", 2, 410, 18));

        pullAndBear.urunEkle(new Urun("SWEATSHİRT", "KOYU YEŞİL", "PULL AND BEAR", "LARGE", 3, 420, 19));

        pullAndBear.urunEkle(new Urun("T-SHİRT", "BEJ - HAKİ - SİYAH - BEYAZ", "PULL AND BEAR", "SMALL", 12, 320, 20));

        pullAndBear.urunEkle(new Urun("T-SHİRT", "BEJ - HAKİ - SİYAH - BEYAZ", "PULL AND BEAR", "MEDIUM", 10, 340, 21));

        pullAndBear.urunEkle(new Urun("T-SHİRT", "BEJ - HAKİ - SİYAH - BEYAZ", "PULL AND BEAR", "LARGE", 10, 360, 22));

        // CALVIN KLEIN
        Magaza calvinKlein = new Magaza("CALVIN KLEIN", "Beylikdüzü / İstanbul Marmara Park ", 3417, 3678, 27, 1000);
        magazaEkle(calvinKlein);
        calvinKlein.urunEkle(new Urun("KAZAK&HIRKA", "KAHVERENGİ - KEHRİBAR - KOYU MERCAN - LAVANTA MOR - SİYAH", "CALVİN KLEİN", "SMALL", 11, 750, 23));

        calvinKlein.urunEkle(new Urun("KAZAK&HIRKA", "KAHVERENGİ - KEHRİBAR - KOYU MERCAN - LAVANTA MOR - SİYAH", "CALVİN KLEİN", "MEDIUM", 11, 850, 24));

        calvinKlein.urunEkle(new Urun("KAZAK&HIRKA", "KAHVERENGİ - KEHRİBAR - KOYU MERCAN - LAVANTA MOR - SİYAH", "CALVİN KLEİN", "LARGE", 11, 950, 25));

        calvinKlein.urunEkle(new Urun("GÖMLEK", "PRUSYA-MAVİSİ - SİYAH - BEYAZ - LACİVERT - KAHVERENGİ", "CALVİN-KLEİN", "SMALL", 5, 550, 26));

        calvinKlein.urunEkle(new Urun("GÖMLEK", "PRUSYA-MAVİSİ - SİYAH - BEYAZ - LACİVERT - KAHVERENGİ", "CALVİN-KLEİN", "MEDIUM", 5, 570, 27));

        calvinKlein.urunEkle(new Urun("GÖMLEK", "PRUSYA-MAVİSİ - SİYAH - BEYAZ - LACİVERT - KAHVERENGİ", "CALVİN-KLEİN", "LARGE", 5, 590, 28));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 30/32 ", 5, 950, 29));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 30/34 ", 5, 950, 30));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 32/34 ", 5, 950, 31));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 32/36 ", 5, 950, 32));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 32/38 ", 5, 950, 33));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 34/34 ", 5, 950, 34));

        calvinKlein.urunEkle(new Urun("EŞOFMAN", "BEJ-GRİ-SİYAH-KREM", "CALVİN-KLEİN", "BOY/BEL = 34/36 ", 5, 950, 35));

    }

    public void calis1() {

        Scanner scan = new Scanner(System.in);

        System.out.println("SİSTEME HOŞ GELDİNİZ");
        System.out.println("******************************");

        System.out.println("Kullanıcı Girişi");
        System.out.println("******************************");
        int giris_hakki = 3;

        while (true) {
            Kullanici loginSonucKullanici = login.Login(); // girişi kontrol eden yapı 
            //Kullanici loginSonucKullanici = kullanicilar[0];

            if (loginSonucKullanici != null) { // boş değilse doğru giriş
                System.out.println("GİRİŞ BAŞARILI");
                loginSonucKullanici.bilgileriGoster();
                aktifKullanici = loginSonucKullanici;
                break;
            } else {
                System.out.println("Giriş Başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan son hakkınız: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giriş hakkınız bitti");
                return;
            }

        }

        System.out.println("******************************");
// sistemim asıl başladığı yer
        while (true) {
            magazalariListele();
            System.out.println("SİSTEMDEN ÇIKIŞ İÇİN q'ya BASINIZ");
            System.out.println("");
            System.out.println(">>> Hangi Mağazaya Girmek İstiyorsunuz? <<<");

            String magazaSec = scan.nextLine();

            if (magazaSec.equals("q")) {
                System.out.println("SİSTEMDEN ÇIKILIYOR...");
                break;

            } else if (Integer.parseInt(magazaSec) > magazalarIndex) {
                System.out.println("Öyle bir mağaza yok tekrar başlatın ");
                break;
            }

            Magaza magaza = magazaGetir(magazaSec); 
            System.out.println(magaza.getMagaza_adi() + " MAĞAZASINA HOŞGELDİNİZ:)\n");

            String islemler = "******************************\n"
                    + " 1.Mağaza Bilgilerini Görüntüle\n"
                    + " 2.Ürün Bilgilerini Görüntüle\n"
                    + " 3.Sepetimi Görüntüle\n"
                    + " 4.Sepet İşlem\n"
                    + " 5.Ödeme Yap\n"
                    + " 6.Mağazaların Karşılaştırma Bilgilerini Göster \n "
                    + "Mağazadan Çıkmak İstiyorsanız q'ya Basınız.\n"
                    + "******************************\n";
            while (true) {
                System.out.println(islemler);
                System.out.println("Hangi işlemi yapmak istiyorsunuz ?");

                scan = new Scanner(System.in);
                String islem = scan.nextLine();

                if (islem.equals("q")) {
                    System.out.println("");
                    System.out.println("Tekrar Bekleriz:)");
                    System.out.println("");

                    break;

                } else if (islem.equals("1")) {

                    System.out.println("");
                    magaza.bilgileriGoster();

                } else if (islem.equals("2")) {

                    System.out.println("");
                    System.out.println("Ürünler");

                    magaza.magazadakiUrunTurleriGoster();

                    System.out.println("Hangi Ürünü Görüntülemek İstiyorsunuz ?");
                    String urunSec = scan.nextLine();
                    int urunSecNumara = Integer.parseInt(urunSec) - 1;
                    String urunTuru = magaza.magazadakiUrunTurleri()[urunSecNumara].getUrununAdi(); // PANTOLON MONT VS 

                    System.out.println("");

                    for (int i = 1; i < magaza.urunlerIndex + 1; i++) { // ÜRÜNLERİN NUMARASINI GÖSTERMEK İÇİN ÜRÜNLERİN İÇİNE GİRİP YAZDIRDIM
                        if (magaza.urunler[i - 1].getUrununAdi().equals(urunTuru) && magaza.urunler[i - 1].getUrununStokAdedi() > 0) {
                            System.out.println("URUN NO: " + i);
                            magaza.urunler[i - 1].bilgileriGöster(); // NEDEN 1 EKSİ 0 DAN BAŞLIYOR
                        }
                    }
                    System.out.println("Almak İstediğiniz Bir Ürün Varsa Lütfen Ürün Numarasını Giriniz Yoksa q'ya Basınız.");
                    String urunIslemNumara = scan.nextLine();

                    //      Urun sepeteEklenecekUrun = magaza.urunler[Integer.parseInt(urunIslemNumara) - 1];
                    if (urunIslemNumara.equals("q")) {
                        System.out.println("Çıkış Yapılıyor.");
                    } else {
                        Urun sepeteEklenecekUrun = magaza.urunler[Integer.parseInt(urunIslemNumara) - 1];
                        boolean sonuc = false;
                        while (!sonuc) {
                            System.out.println("Kac adet eklemek istersiniz?");
                            int adet = scan.nextInt();
                            sonuc = aktifKullanici.sepeteEkle(sepeteEklenecekUrun, adet);
                        }
                    }

                } else if (islem.equals("3")) {
                    System.out.println("******************************");
                    System.out.println("SEPET BİLGİLERİ");
                    System.out.println("SEPETİNİZDEKİ ÜRÜNLER");
                    for (int i = 0; i < aktifKullanici.sepetIndex; i++) {
                        SepettekiUrun sepettekiUrun = aktifKullanici.sepet[i];
                        System.out.println(sepettekiUrun.getAdet() + " Adet " + sepettekiUrun.getUrun().getUrununAdi()
                                + " " + sepettekiUrun.getUrun().getUrununFiyati() * sepettekiUrun.getAdet() + " TL");

                    }

                } else if (islem.equals("4")) {
                    System.out.println("******************************");
                    System.out.println("SEPET İŞLEM BÖLÜMÜ");
                    System.out.println("SEPETİNİZDEKİ ÜRÜNLER");

                    for (int i = 0; i < aktifKullanici.sepetIndex; i++) {
                        SepettekiUrun sepettekiUrun = aktifKullanici.sepet[i];
                        System.out.println("ÜRÜN NO " + (i + 1) + " " + sepettekiUrun.getAdet() + " Adet " + sepettekiUrun.getUrun().getUrununAdi()
                                + " " + sepettekiUrun.getUrun().getUrununFiyati() * sepettekiUrun.getAdet() + " TL " + sepettekiUrun.getUrun().getUrununBedeni() + " Beden "
                                + "" + sepettekiUrun.getUrun().getUrununMarkasi());

                    }

                    System.out.println("HANGİ ÜRÜNÜ ÇIKARTMAK İSTEDİĞİNİZİ ÜRÜN NO'SUNU YAZARAK BELİRTİNİZ YOKSA q'ya BASINIZ ");
                    String sepetUrunSil = scan.nextLine();  //

                    if (sepetUrunSil.equals("q")) {
                        break;
                    } else {
                        for (int i = 0; i < aktifKullanici.sepetIndex; i++) {
                            SepettekiUrun sepettekiUrun = aktifKullanici.sepet[i];
                            if (i == Integer.parseInt(sepetUrunSil) - 1) { //string olan yazıyı sayıyı inte çevirir
                                aktifKullanici.sepetUrunCikart(sepettekiUrun.getUrun());
                            }

                        }
                    }

                } else if (islem.equals("5")) {
                    System.out.println("******************************");
                    System.out.println("ÖDEME İŞLEMİ YAPILIYOR");
                    
                    aktifKullanici.alısverisSayisi = aktifKullanici.alısverisSayisi + aktifKullanici.sepetIndex; 
                    
                    Double sepetTutari = aktifKullanici.sepetTutariHesapla();

                    System.out.println("TOPLAM TUTAR = " + sepetTutari);
                    if (aktifKullanici.premiumKullanici) {
                        System.out.println("İNDİRİMLİ TUTAR = " + aktifKullanici.sepetTutariHesapla());
                    }
                    if (sepetTutari <= aktifKullanici.getBakiye()) {
                        aktifKullanici.setBakiye(aktifKullanici.getBakiye() - sepetTutari);
                        System.out.println("YENİ BAKİYENİZ = " + aktifKullanici.getBakiye());
                        aktifKullanici.sepetTemizle();
                    } else {
                        System.out.println("Yetersiz Bakiye,İşleminiz Gerçekleşmedi!");
                    }
                } else if (islem.equals("6")) {
                    System.out.println("");

                    System.out.println("İstatistik Bölümüne Hoşgeldiniz:)");

                    karsılastırmaBilgileri();

                } else {
                    System.out.println("İşlemlerimizde böyle bir seçenek yok lütfen işlem yapmak istiyorsanız doğru sayıyı seçiniz!");

                }

            }

        }

    }

    public Magaza magazaGetir(String metin) {  // magazaları listelemek için
        int sayi = Integer.parseInt(metin); // burada stringi inte çevirdik
        return magazalar[sayi - 1]; 
    }

    public int[] minMaxUrunFiyatı() {

        int min = Integer.MAX_VALUE;
        int max = 0;
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < aktifKullanici.sepetIndex; i++) {
            if (aktifKullanici.sepet[i] != null) {

                if (aktifKullanici.sepet[i].getUrun().getUrununFiyati() > max) {
                    maxIdx = i;
                    max = (int) aktifKullanici.sepet[i].getUrun().getUrununFiyati();

                }
                if (aktifKullanici.sepet[i].getUrun().getUrununFiyati() < min) {
                    minIdx = i;
                    min = (int) aktifKullanici.sepet[i].getUrun().getUrununFiyati();

                }

            }

        }

        return new int[]{maxIdx, minIdx};
    }

    public int[] minMaxAlısverisYapanKisi() {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < kullanicilarIndex; i++) {

            if (kullanicilar[i] != null) {

                if (kullanicilar[i].alısverisSayisi > max) {
                    maxIdx = i;
                    max = (int) kullanicilar[i].alısverisSayisi;

                }
                if (kullanicilar[i].alısverisSayisi < min) {
                    minIdx = i;
                    min = (int) kullanicilar[i].alısverisSayisi;

                }
            }

        }

        return new int[]{maxIdx, minIdx};
    }

    public int[] minMaxTakipci() {

        int min = Integer.MAX_VALUE;
        int max = 0;
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < magazalarIndex; i++) {

            if (magazalar[i] != null) {
                if (magazalar[i].getTakipci_sayisi() > max) {
                    maxIdx = i;
                    max = (int) magazalar[i].getTakipci_sayisi();
                }
                if (magazalar[i].getTakipci_sayisi() < min) {
                    minIdx = i;
                    min = (int) magazalar[i].getTakipci_sayisi();
                }
            }
        }

        return new int[]{maxIdx, minIdx};
    }

    public int[] minMaxBegeni() {

        int min = Integer.MAX_VALUE;
        int max = 0;
        int min_idx = 0;
        int max_idx = 0;

        for (int i = 0; i < magazalarIndex; i++) {
            if (magazalar[i] != null) {
                if (magazalar[i].getBegeniSayisi() > max) {
                    max_idx = i;
                    max = (int) magazalar[i].getBegeniSayisi();
                }
                if (magazalar[i].getBegeniSayisi() < min) {
                    min_idx = i;
                    min = (int) magazalar[i].getBegeniSayisi();
                }
            }
        }

        return new int[]{max_idx, min_idx};
    }

    public void karsılastırmaBilgileri() {

        System.out.println("EN AZ TAKİPÇİ:");
        System.out.println("------------------");
        int[] min_max_takipci = minMaxTakipci();
        magazalar[min_max_takipci[1]].bilgileriGoster();

        System.out.println("EN FAZLA TAKİPÇİ:");
        System.out.println("------------------");
        magazalar[min_max_takipci[0]].bilgileriGoster();

        System.out.println("EN AZ BEĞENİ:");
        System.out.println("------------------");
        int[] min_max_begeni = minMaxBegeni();
        magazalar[min_max_begeni[1]].bilgileriGoster();

        System.out.println("EN FAZLA BEĞENİ:");
        System.out.println("------------------");
        magazalar[min_max_begeni[0]].bilgileriGoster();

        System.out.println("EN UCUZ ÜRÜN");
        System.out.println("------------------");
        int[] min_max_urun_fiyati = minMaxUrunFiyatı();
        aktifKullanici.sepet[min_max_urun_fiyati[1]].getUrun().bilgileriGöster();

        System.out.println("EN PAHALI ÜRÜN");
        System.out.println("------------------");
        aktifKullanici.sepet[min_max_urun_fiyati[0]].getUrun().bilgileriGöster();

        System.out.println("EN AZ ALIŞVERİŞ YAPAN KULLANICI");
        System.out.println("------------------");
        int[] en_cok_alısveris_yapan_kullanici = minMaxAlısverisYapanKisi();
        kullanicilar[en_cok_alısveris_yapan_kullanici[1]].bilgileriGoster();

        System.out.println("EN FAZLA ALIŞVERİŞ YAPAN KULLANICI");
        System.out.println("------------------");
        kullanicilar[en_cok_alısveris_yapan_kullanici[0]].bilgileriGoster();
    }

}
