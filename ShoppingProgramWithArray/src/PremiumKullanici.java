
public class PremiumKullanici extends Kullanici {

   private  Double indirimOrani; // premium kullanıcı için indirim oranı 
    public PremiumKullanici(String kullanici_adi, String kullanici_soyadi, String kullanici_parola, String uyelik_tarihi, Double bakiye) {
        super(kullanici_adi, kullanici_soyadi, kullanici_parola, uyelik_tarihi, bakiye);
        this.premiumKullanici = true;
        this.indirimOrani = 0.2; // burada sabitledim
    }

    @Override // premim kullanıcıya ait indirim override
    public Double sepetTutariHesapla() {
        Double sepetTutari = 0.0;
        for (int i = 0; i < this.sepetIndex; i++) { // sepet içi
            sepetTutari += (this.sepet[i].getAdet() * this.sepet[i].getUrun().getUrununFiyati());
        }
        return sepetTutari-(sepetTutari*indirimOrani);
    }

}
