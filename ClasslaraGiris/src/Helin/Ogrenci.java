package Helin;

public class Ogrenci {

    public long id;   // değişken- field-property

    public String isim;

    public String soyisim;

    public Ogrenci(int id, String isim, String soyisim)
    {
            //this : şuan üzerinde çalıştığın class
            this.id= id;
            this.isim= isim;
            this.soyisim = soyisim;
    }
}
