import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        polymorhism = poly-many, morph-form,
//        The ability of an object to identify as more than one type
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat}; // its an array but each element has different type
//        to solve this multi type isssue we use polymorhism, all are Vehicle type
//car.go();
//bicycle.go();
//boat.go(); better way is making for loop
        for (Vehicle x : racers) {
            x.go(); // we need to create go method in Vehicle as well
        }
// polymorhism is many type forms
//        dynamic polymorhism = after compilation (during runtime)
//ex: A convertte is a: corvette and a car, and a vehicle, and also its an object
//  we will have to ask user, which animal during the runtime::?? Animal animal = new Dog(); or we will use Animal animal = new Cat(); but we are not sure yet
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal you want 1=Dog or 2=Cat");
        int choice = scanner.nextInt();
        if(choice == 1){
            Animal animal = new Dog();
            animal.speak();
        } else if(choice == 2){
            Animal animal = new Cat();
            animal.speak();
        }
        else {
            Animal animal = new Animal();
            System.out.println("invalid choice");

        }
    }
}
