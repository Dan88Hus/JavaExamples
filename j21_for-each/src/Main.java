import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
// for-each = traversing technique to iterate through the elements in array/collection
//        less steps, more readable
//        less flexible
        String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animalsAList = new ArrayList();

        animalsAList.add("cat");
        animalsAList.add("bat");
        animalsAList.add("rat");
        animalsAList.add("poo");



        for(String i: animalsAList){
            System.out.println(i);
        }
        hello(); // void hello() : non static method hello can not call inside of static method
String name = "Daniel";
        hello2(name);
        int x = 3;
        int y = 5;
        int z = add(x,y);
        System.out.println("result; "+z);

    } // main method curly brackets
//        Java methods = a block of code that is executed whenever it is called upon
    static void hello(){
        System.out.println("Hello");
    }
    static void hello2(String title){
        System.out.println("name: "+title);
    }
    static int add(int x , int y){
        return x+y;
    }
}
