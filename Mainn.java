class Dog {
    String breed;
    int age;
    String color;
    int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;        
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void printDetails() {
        System.out.println("Dog details");
        System.out.println("Dog breed: " + this.breed);
        System.out.println("Dog age: " + this.age);
        System.out.println("Dog color: " + this.color);
        System.out.println("Dog weight: " + this.weight +"kg");
    }
    public void setter(String breed, int age, String color, int weight) {
        setBreed(breed);
        setAge(age);
        setColor(color);
        setWeight(weight);
    }
}

public class Mainn {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        firstDog.setter("German Shepard", 1, "black", 10);
        firstDog.printDetails();
    }

}
