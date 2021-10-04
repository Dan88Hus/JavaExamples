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
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);
    } // not present parameters will be null at output
}
