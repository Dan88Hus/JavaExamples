public class Main {
    public static void main(String[] args){
//        Encapsulation = attributes of a class will be hidden or private,
//   can be accessed only through methods (getters& setters)
//   you should make attributes private if you dont have a reason to make them public/protected
    Car car = new Car("FORD","MODEL A",2021);
//        System.out.println(car.make); // make has private access in Car so we need to use getters
        System.out.println(car.getMake()); //FORD
        car.setYear(2022);
        System.out.println(car.getYear());
    }

}
