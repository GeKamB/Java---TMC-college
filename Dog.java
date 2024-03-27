public class Dog {
    String name;
    int age;
    String breed;
// Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void printDetails() {
        System.out.println("\tDog details: ");
        System.out.println("Dog name: " + name);
        System.out.println("Dog breed: " + breed);
        System.out.println("Dog age: " + age);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
    public void fetch() {
        System.out.println(name + " is fetching the stick");
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

