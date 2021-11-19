public class TestingDog {
    class Dog {
        int size;
        String breed;
        String name;

        void bark() {
            System.out.println("ruff, ruff!!");
        }
    }
    class DogTestDrive {
        public void main (String[] args) {
            // Dog test code goes here
            Dog d = new Dog();
            d.size = 40;
            d.breed = "hound";
            d.bark();
        }
    }
}