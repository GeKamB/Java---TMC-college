
    
abstract class Vehicle {
        abstract void start();
        abstract void stop();
    }
class Car extends Vehicle {
    void start() {
        System.out.println("Car Starts... brum brum brum...");
    }
    void stop() {
        System.out.println("Car stops.");
    }
}
class Truck extends Vehicle {
    void start() {
        System.out.println("Truck starts ... wrrr wrrr wrrr...");
    }
    void stop() {
        System.out.println("Truck stops.");
    }
}
class Bus extends Vehicle {
    void start() {
        System.out.println("Bus starts.");
    }
    void stop() {
        System.out.println("Bus stops.");
    }
}