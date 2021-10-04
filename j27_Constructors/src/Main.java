public class Main {
    public static void main(String[] args){
// constructor = special method that is called when an object is instantiated (created)



        Human human = new Human("Rick", 65, 70.0); // this instantiate Human class
        Human human2 = new Human("Daniel", 38, 68.5); // this instantiate Human class

        System.out.println(human2.name);

        human2.eat();
        human2.drink();
    }
}
