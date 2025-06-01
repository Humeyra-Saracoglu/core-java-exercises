package This_Super;

    public class Student extends Person {
        String school;

        public Student(String name, int age, String school) {
            super(name, age);
            this.school = school;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Okul  : " + this.school);
        }
    }


