public class Main {
    public static void main(String[] args) {
//  interface = a template that can be applied to a class.
//        similar to interface, but specifies what a class has/must do
//        classes can apply more than one interface, inheritance is limited to 1 super
// with interfaces you can declare variables normally, like inheritance we do
//        we can also declare some methods, you dont need to create body for these methods
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.Hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.Hunt();


    }

}
