public class Main {
    public static void main(String[] args){
    Garage garage = new Garage();
    Car car = new Car("BMW");
    Car car2 = new Car("Tesla");

    garage.park(car);
    garage.park(car2);
        System.out.println(Car.numberOfCar);// it counts each park method run
    }
//    static key word = a single copy of a variable/ method is created and shared.
//    the class "owns" the static member
//    like local variable
//    any static keyword is used makes variable local within created class
//    and also common variable for where static variable called such as Main
// numberOfCar is our example for static variable, its common variable
}
