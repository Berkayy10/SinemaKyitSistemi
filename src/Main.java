import java.util.ArrayList;
import java.util.List;

// BaseEntity sınıfı (Temel sınıf)
abstract class BaseEntity {
    private int id;
    private String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void BilgiGoster();
}

// Musteri sınıfı
class Musteri extends BaseEntity {
    public Musteri(int id, String name) {
        super(id, name);
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", Adı: " + getName());
    }
}

// Film sınıfı
class Film {
    private String ad;
    private int sure; // dakika cinsinden
    private String tur;

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    public void BilgiGoster() {
        System.out.println("Film Adı: " + ad + ", Süresi: " + sure + " dk, Türü: " + tur);
    }
}

// IKayit interface'i
interface IKayit {
    void musteriEkle(Musteri musteri);
    List<Musteri> getMusteriler();
}

// Salon sınıfı
class Salon extends BaseEntity implements IKayit {
    private Film oynatilanFilm;
    private List<Musteri> musteriler;

    public Salon(int id, String name, Film oynatilanFilm) {
        super(id, name);
        this.oynatilanFilm = oynatilanFilm;
        this.musteriler = new ArrayList<>();
    }

    public Film getOynatilanFilm() {
        return oynatilanFilm;
    }

    @Override
    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    @Override
    public List<Musteri> getMusteriler() {
        return musteriler;
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Salon ID: " + getId() + ", Adı: " + getName());
        oynatilanFilm.BilgiGoster();
    }
}

// Ana sınıf
public class SinemaKayitSistemi {
    public static void main(String[] args) {
        // Filmleri tanımlama
        Film film1 = new Film("Matrix", 150, "Bilim Kurgu");
        Film film2 = new Film("Titanic", 195, "Romantik");

        // Salonları tanımlama
        Salon salon1 = new Salon(1, "Salon A", film1);
        Salon salon2 = new Salon(2, "Salon B", film2);

        // Müşterileri tanımlama
        Musteri musteri1 = new Musteri(1, "Ahmet");
        Musteri musteri2 = new Musteri(2, "Ayşe");
        Musteri musteri3 = new Musteri(3, "Mehmet");

        // Müşterileri salonlara ekleme
        salon1.musteriEkle(musteri1);
        salon1.musteriEkle(musteri2);
        salon2.musteriEkle(musteri3);

        // Çıktıları gösterme
        System.out.println("SALONLAR VE DETAYLARI:");
        salon1.BilgiGoster();
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : salon1.getMusteriler()) {
            musteri.BilgiGoster();
        }

        System.out.println();

        salon2.BilgiGoster();
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : salon2.getMusteriler()) {
            musteri.BilgiGoster();
        }
    }
}
