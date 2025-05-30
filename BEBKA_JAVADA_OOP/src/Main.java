public class Main {

    public static void main(String[] args) {
        Animal hayvan1 = new Cat();
        Animal hayvan2 = new Dog();

        hayvan1.makeSound();
        hayvan2.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Bir hayvan ses çıkarıyor...");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Kedi  : Miyavvv!");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Köpek : Havv havv!");
    }
}
