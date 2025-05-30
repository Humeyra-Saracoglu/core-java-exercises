public class Student extends Vehicle {
    String isim;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void display() {
        System.out.println("Öğrenci: " + isim);
        showSpeed();
    }

    public static void main(String[] args) {
        Student ogrenci = new Student();
        ogrenci.setIsim("Helin");
        ogrenci.setSpeed(100);
        ogrenci.display();
    }
}
