import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
//        overloaded constructors = multiple constructors within a class with the same name,
//        but have different parameters
//        name  + parameters = signature
Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella","pepperoni");
//        System.out.println("Here are the ingredients of your pizza: ");
//        System.out.println(pizza.bread);
//        System.out.println(pizza.sauce);
//        System.out.println(pizza.cheese);
//        System.out.println(pizza.topping);

        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzarella");
//        System.out.println("Here are the ingredients of your pizza: ");
//        System.out.println(pizza2.bread);
//        System.out.println(pizza2.sauce);
//        System.out.println(pizza2.cheese);
//        System.out.println(pizza2.topping);
        Car car = new Car();
        System.out.println(car.toString()); // output: object adress
        System.out.println(car.toStringOverride()); // returns to string instead of object addres
//        to override toString method



    } // not present parameters will be null at output

//    toString() = special method that all objects inherit,
//    that returns a string that " textually represents" an object
//    can be used both implicitly and explicitly


}
