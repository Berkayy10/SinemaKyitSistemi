<h1>Sinema Kayıt Sistemi</h1>
<p>
   Bu proje, bir sinema kayıt sistemi uygulamasıdır. Kullanıcıdan alınan bilgilerle filmler, salonlar ve müşteriler oluşturulabilir. Sistem, bu varlıklar arasında bağlantılar kurar ve bilgileri listeleyerek kullanıcıya sunar.
</p>

<h2>Özellikler</h2>
<ul>
    <li><strong>Film Yönetimi:</strong> Film adı, süresi ve türü bilgilerini tutar.</li>
    <li><strong>Salon Yönetimi:</strong> Her salon bir filmle ilişkilendirilir ve müşteri kayıtlarını tutar.</li>
    <li><strong>Müşteri Yönetimi:</strong> Müşteriler, salonlara kaydedilir ve sistemde listelenir.</li>
    <li><strong>Konsol Tabanlı:</strong> Kullanıcı ile tüm etkileşim konsol üzerinden gerçekleştirilir.</li>
</ul>

<h2>Kullanım</h2>
<ol>
    <li>Program çalıştırıldığında, kullanıcıdan sırasıyla:
        <ul>
            <li>Film bilgileri (ad, süre, tür)</li>
            <li>Salon bilgileri (ad, oynatılan film)</li>
            <li>Müşteri bilgileri (ad, hangi salona kayıtlı olduğu)</li>
        </ul>
        istenir.
    </li>
    <li>Girişler tamamlandıktan sonra, sistem kullanıcıya tüm salonların, filmlerin ve müşteri listelerinin detaylarını sunar.</li>
</ol>

<h2>Kurulum</h2>
<ol>
    <li>Java JDK yüklü olduğundan emin olun.</li>
    <li>Projeyi bilgisayarınıza klonlayın veya kodu bir dosyaya yapıştırın (ör. <code>SinemaKayitSistemi.java</code>).</li>
    <li>Konsol üzerinden aşağıdaki komutlarla programı derleyip çalıştırın:</li>
    <pre>
        <code>
        javac SinemaKayitSistemi.java
        java SinemaKayitSistemi
        </code>
    </pre>
</ol>

<h2>Yapı</h2>
<ul>
    <li><strong>BaseEntity:</strong> Tüm varlıklar için ortak özellikleri ve metotları tanımlar.</li>
    <li><strong>Musteri:</strong> Müşteri bilgilerini tutar.</li>
    <li><strong>Film:</strong> Filmlere ait bilgileri saklar.</li>
    <li><strong>Salon:</strong> Filmler ve müşterilerle ilişkilendirilir. <code>IKayit</code> arayüzünü uygular.</li>
    <li><strong>IKayit:</strong> Müşteri ekleme ve listeleme işlevlerini sağlar.</li>
</ul>

<h2>Çıktı Örneği</h2>
<pre>
    SALONLAR VE DETAYLARI:
    Salon ID: 1, Adı: Salon A
    Oynatılan Film:
    Film Adı: Matrix, Süresi: 150 dk, Türü: Bilim Kurgu
    Kayıtlı Müşteriler:
    Müşteri ID: 1, Adı: Ahmet
    Müşteri ID: 2, Adı: Ayşe

    Salon ID: 2, Adı: Salon B
    Oynatılan Film:
    Film Adı: Titanic, Süresi: 195 dk, Türü: Romantik
    Kayıtlı Müşteriler:
    Müşteri ID: 3, Adı: Mehmet
</pre>

<h2>Gereksinimler</h2>
<ul>
    <li>Java 8 veya üzeri</li>
    <li>Konsol tabanlı bir terminal</li>
</ul>

<h2>Katkıda Bulunma</h2>
<p>
   Bu projeye katkıda bulunmak isterseniz, lütfen bir <code>Pull Request</code> gönderin veya bir <code>Issue</code> açın.
</p>
