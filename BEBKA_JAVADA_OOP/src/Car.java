public class Car {
    String marka;
    String model;
    int yil;

    public Car(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public void bilgileriYazdir() {
        System.out.println("Marka : " + marka);
        System.out.println("Mode  : " + model);
        System.out.println("Yıl   : " + yil);
    }

    public static void main(String[] args) {

        Car benimArabam = new Car("TOGG", "T10X", 2023);

        benimArabam.bilgileriYazdir();
    }
}
