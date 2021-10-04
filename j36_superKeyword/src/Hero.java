public class Hero extends Person{
    String Power;

    Hero(String name, int age, String Power){
//        this.name = name;
//        this.age = age;
//        this.Power  = Power; //boyle calisir ama super kullanmak istersek
        super(name, age); // name and age values will go to super class
        this.Power  = Power;
    }
}
