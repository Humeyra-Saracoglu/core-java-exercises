package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int toplam1 = calc.add(28, 30);
        int toplam2 = calc.add(34, 41, 88);

        System.out.println("2 sayının toplamı : " + toplam1 + " eder.");
        System.out.println("3 sayının toplamı : " + toplam2 + " eder.");
    }
}

