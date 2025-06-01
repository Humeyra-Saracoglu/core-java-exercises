package MethodOverriding;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Araba kontağı çevirdi ve çalıştı gidebilirsin artık!");
    }
}
