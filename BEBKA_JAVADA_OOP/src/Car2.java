import java.util.Scanner;

public class Car2 {

    String marka;
    String model;
    int yıl;

    // Constructor
    public Car2(String marka, String model, int yıl) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
    }

    public void displayInfo() {
        System.out.println("Marka  : " + marka);
        System.out.println("Model  : " + model);
        System.out.println("Yıl    : " + yıl);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marka giriniz  : ");
        String marka = scanner.nextLine();

        System.out.print("Model giriniz  : ");
        String model = scanner.nextLine();

        System.out.print("Yıl giriniz    : ");
        int yıl = scanner.nextInt();

        Car2 userCar = new Car2(marka, model, yıl);
        userCar.displayInfo();
    }
}
