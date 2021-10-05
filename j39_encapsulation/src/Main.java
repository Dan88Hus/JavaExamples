public class Main {
    public static void main(String[] args){
//        Encapsulation = attributes of a class will be hidden or private,
//   can be accessed only through methods (getters& setters)
//   you should make attributes private if you dont have a reason to make them public/protected
    Car car1 = new Car("FORD","MODEL A",2021);
    Car car2 = new Car("MUSTANG","MODEL B",2020);
//        System.out.println(car.make); // make has private access in Car so we need to use getters
        System.out.println(car1.getMake()); //FORD
        car1.setYear(2022);
        System.out.println(car1.getYear());

//        when we copy
        car2.copyMETHOD(car1);
        System.out.println(car2.getYear());
//         or we can overload class by passing object as argument of Car

    }

}
