package This_Super;

public class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("İsim : " + name);
            System.out.println("Yaş  : " + age);
        }
    }

