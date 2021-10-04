public class Main {
    public static void main(String[] args){
//int[] numbers = new int[3]; // standart way
//char[] characters = new char[4]; // standart way
//String[] strings = new String[5]; // standart way to create array
//         creating array of objects
 Food[] refrigerator = new Food[3];
 Food food1 = new Food("Pizza");
 Food food2 = new Food("Apple");
 Food food3 = new Food("Broccoli");
// OR we can assign like
        Food[] refrigerator11 = {food1, food2,food3};

 refrigerator[0] = food1;
 refrigerator[1] = food2;
 refrigerator[2] = food3;

        System.out.println(refrigerator);// object address
        System.out.println(refrigerator[0].name);// Pizza
        System.out.println(refrigerator11[0].name);// Pizza


    }
}
