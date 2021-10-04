public class Main {
    public static void main(String[] args) {
//abstract = classes can not be instantiated, but they can have a subclass
//        abstract methods are declared without an implementation
        //adding abstract class add level of security
//         we ask car dealer, we want vehicle , so dealer ask us what kind of vehicle you want
//         so vehicle is generic which means an abstract layer

        Car car = new Car();
//        Vehicle vehicle = new Vehicle(); //'Vehicle' is abstract; cannot be instantiated

        car.go();
    }
}

