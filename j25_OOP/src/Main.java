public class Main {
    public static void main(String[] args){
//        when we declare final word , can not be changed or can not be mutated
//        it makes const in variable

//        OOP = an instance of class that may contain attributes and methods
//        ex: (phone, desk, computer, coffee cup and etc)
//        Object uses class
        Car myCar = new Car();
        Car myCar2 = new Car();


        System.out.println(myCar.model);
        System.out.println(myCar.make);

        myCar.drive();
        myCar.brake();

        myCar2.drive();
        myCar2.brake();


    }
}
