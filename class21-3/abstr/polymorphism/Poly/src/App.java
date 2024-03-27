 class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    };
   
}

class Dog extends Animal {
    
    void sound() {
        System.out.println("Dog barks: woof ! woof !");
    }
}

class Cat extends Animal {
    
    void sound() {
        System.out.println("Cat meows: meoooow !");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
