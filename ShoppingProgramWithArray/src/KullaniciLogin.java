
import java.util.Scanner;

public class KullaniciLogin {

    private Sistem sistem;

    public KullaniciLogin(Sistem sistem) {
        this.sistem = sistem;

    }
// kullanıcı özellikleri kontrol etmesi için bir giriş kontrolü yaptım
    public Kullanici Login() {

        Scanner scan = new Scanner(System.in);

        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı Adı:");
        kullaniciAdi = scan.nextLine();

        System.out.print("Kullanıcı Parola:");
        parola = scan.nextLine();

        for (int i = 0; i < sistem.kullanicilarIndex; i++) {

            if (sistem.kullanicilar[i].getKullanici_adi().equals(kullaniciAdi) && sistem.kullanicilar[i].getKullanici_parola().equals(parola)) {

                return sistem.kullanicilar[i];
            }
        }
        return null;
    }

}
