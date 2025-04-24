# OOP-Array-Product-Management-Login
Bu proje, nesne yönelimli programlama (OOP) prensipleriyle tasarlanmış bir "Ürün Yönetimi" uygulamasıdır. Kullanıcılar, giriş yaparak sisteme erişebilir ve yalnızca yetkilendirilmiş kullanıcılar ürün bilgilerine ulaşabilir. Urun sınıfı, ürünlerin temel bilgilerini tutarken; Kullanici sınıfı kullanıcı giriş işlemleri için kullanılır. Kullanıcı adı ve şifre doğrulaması ile login işlemi gerçekleştirilir. UrunYonetimi sınıfı, ürünlerin yönetilmesi ve listelenmesi gibi işlemleri içerir. Tüm bu sınıflar, array kullanılarak veriler üzerinde işlemler yapar ve güvenli bir şekilde yönetir. OOP prensiplerine dayalı olarak, veri yönetimi, kullanıcı etkileşimi ve güvenlik sağlanır.
## Özellikler

- **Kullanıcı Girişi**:
  - Kullanıcılar, sisteme kullanıcı adı ve şifre ile giriş yapabilirler.
  - Login işlemi: Giriş başarılı olduğunda, kullanıcıya ürün yönetimi paneline erişim hakkı verilir.
  - Hatalı girişlerde kullanıcıya hata mesajı gösterilir.
    
- **Ürün Yönetimi**:
  - Kullanıcılar sisteme giriş yaptıktan sonra ürün ekleme, güncelleme ve silme işlemleri yapabilirler.
  - Ürünler bir dizi (array) içerisinde saklanır ve yönetilir.
  - Ürünlerin adı, fiyatı ve stok miktarı gibi bilgileri tutulur.

- **Dizi Kullanımı**:
  - Ürünler, Array veri yapısı kullanılarak yönetilir.
  - Ürünler liste şeklinde saklanır ve dizinin boyutu dinamik olarak kullanıcı etkileşimleriyle güncellenir.
  - Diziler üzerinde yapılan işlemler (ekleme, güncelleme, silme) ile ürünler yönetilir.

- **Nesne Yönelimli Programlama (OOP)**:
  - Ürün sınıfı: Ürünlerin özelliklerini (isim, fiyat, stok miktarı) saklayan sınıf.
  - Kullanıcı sınıfı: Kullanıcı bilgilerini (kullanıcı adı, şifre) saklayan sınıf.
  - Login ve Ürün Yönetimi işlemleri için ilgili sınıflar oluşturulmuştur.
## Gereksinimler

- **Java JDK** (Java 8 veya üzeri)
- **IDE (NetBeans)** (Veritabanı yönetimi için)

